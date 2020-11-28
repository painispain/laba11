package task1;

public class ArrayQueue<E> {

    private Object[] data;
    private int size, start, currentPosition;

    public ArrayQueue() {
        clear();
    }
    public void enqueue(E element) {
        if (start == currentPosition) {
            start = mod(start + 1, data.length);
        }
        data[currentPosition] = element;
        currentPosition = mod(currentPosition + 1, data.length);
        size = Math.min(size + 1, 15);
    }

    @SuppressWarnings("unchecked")
    public E element() {
        return (E) data[start];
    }

    // Pre: size == 0?
    // Post: return null
    public E dequeue() {
        if (size == 0) {
            return null;
        }
        E element = element();
        data[start] = null;
        start = mod(start + 1, data.length);
        size -= 1;
        return element;
    }

    public int size() {
        return size;
    }

    // Pre: size == 0?
    // Post: Result = true/false
    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        data = new Object[15];
        size = start = currentPosition = 0;
    }

    // Pre: c >= 0?
    // Post: If yes, Result = c;
    // Post: Else, Result = c + b;
    private int mod(int a, int b) {
        int c = a % b;
        if (c >= 0) {
            return c;
        } else {
            return c + b;
        }
    }
}
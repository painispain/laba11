package task2;

public class ArrayQueue<E> implements Queue<E>
{
    private Object[] data;
    private int size, start, currentPosition;

    public ArrayQueue() {
        clear();
    }

    @Override
    public void enqueue(E element) {
        if (start == currentPosition) {
            start = mod(start + 1, data.length);
        }
        data[currentPosition] = element;
        currentPosition = mod(currentPosition + 1, data.length);
        size = Math.min(size + 1, 15);
    }

    @Override
    @SuppressWarnings("unchecked")
    public E dequeue() {
        if (size == 0) {
            return null;
        }
        E element = (E) data[start];
        data[start] = null;
        start = mod(start + 1, data.length);
        size -= 1;
        return element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E element()
    {
        return (E) data[start];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        data = new Object[15];
        size = start = currentPosition = 0;
    }

    private int mod(int a, int b) {
        int c = a % b;
        if (c >= 0) {
            return c;
        } else {
            return c + b;
        }
    }
}
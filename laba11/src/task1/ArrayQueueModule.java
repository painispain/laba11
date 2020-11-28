package task1;

public class ArrayQueueModule {
    private static Object[] data;
    private static int size, start, currentPosition;

    static {
        clear();
    }
    public static void enqueue(Object element) {
        if (start == currentPosition) {
            start = mod(start + 1, data.length);
        }
        data[currentPosition] = element;
        currentPosition = mod(currentPosition + 1, data.length);
        size = Math.min(size + 1, 15);
    }

    public static Object element() {
        return data[start];
    }

    // Pre: size == 0?
    // Post: return null
    public static Object dequeue() {
        if (size == 0) {
            return null;
        }
        Object element = element();
        data[start] = null;
        start = mod(start + 1, data.length);
        size -= 1;
        return element;
    }

    public static int size() {
        return size;
    }

    // Pre: size == 0?
    // Post: Result = true/false
    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        data = new Object[15];
        size = start = currentPosition = 0;
    }

    // Pre: c >= 0?
    // Post: If yes, Result = c;
    // Post: Else, Result = c + b;
    private static int mod(int a, int b) {
        int c = a % b;
        if (c >= 0) {
            return c;
        } else {
            return c + b;
        }
    }
}
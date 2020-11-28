package task1;

public class ArrayQueueADT {
    private static Object[] data;
    private static int size, start, currentPosition;

    public ArrayQueueADT() {
        clear();
    }
    public static void enqueue(ArrayQueueADT queue, Object element) {
        if (queue.start == queue.currentPosition)
        {
            queue.start = mod(queue.start + 1, queue.data.length);
        }
        queue.data[queue.currentPosition] = element;
        queue.currentPosition = mod(queue.currentPosition + 1, queue.data.length);
        queue.size = Math.min(queue.size + 1, 15);
    }

    public static Object element(ArrayQueueADT queue) {
        return queue.data[queue.start];
    }

    // Pre: size == 0?
    // Post: return null
    public static Object dequeue(ArrayQueueADT queue) {
        if (queue.size == 0) {
            return null;
        }
        Object element = element(queue);
        queue.data[queue.start] = null;
        queue.start = mod(queue.start + 1, queue.data.length);
        queue.size -= 1;
        return element;
    }

    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Pre: size == 0?
    // Post:  = true/false
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public void clear() {
        data = new Object[15];
        size = start = currentPosition = 0;
    }

    // c >= 0?
    // If yes, = c;
    // Else, = c + b;
    private static int mod(int a, int b) {
        int c = a % b;
        if (c >= 0) {
            return c;
        } else {
            return c + b;
        }
    }
}
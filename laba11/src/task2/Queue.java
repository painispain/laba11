package task2;

public interface Queue<E>
{
    void enqueue(E element);
    Object dequeue();
    Object element();
    int size();
    boolean isEmpty();
    void clear();
}

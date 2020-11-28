package task2;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;

    @Override
    public abstract void enqueue(E element);

    @Override
    public abstract E element();

    @Override
    public abstract E dequeue();

    @Override
    public int size() { return size;}

    @Override
    public boolean isEmpty() {return (size == 0); }

    @Override
    public abstract void clear();

    @Override
    public String toString() {return "size: " + size; }
}
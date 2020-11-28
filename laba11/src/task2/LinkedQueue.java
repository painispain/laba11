package task2;

public class LinkedQueue<E> extends AbstractQueue<E>{

    private static class Node<E> {
        Node<E> next;
        E value;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node<E> head = null, tail = null;

    @Override
    public void enqueue(E element) {
        if (head == null) {
            head = tail = new Node<>(element);
        } else {
            tail.next = new Node<>(element);
            tail = tail.next;
        }
    }

    @Override
    public E dequeue() {
        if (head == null) {
            return null;
        }
        E value = head.value;
        head = head.next;
        return value;
    }

    @SuppressWarnings("unchecked")
    public E element()
    {
        return head.value;
    }

    @Override
    public void clear()
    {
        while (!isEmpty()) {
            dequeue();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}

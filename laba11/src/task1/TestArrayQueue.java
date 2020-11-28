package task1;

public class TestArrayQueue
{
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
        System.out.println("Пусто? " + queue.isEmpty());
        System.out.println("Доб. элементы");
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        System.out.println("Пусто? " + queue.isEmpty());
        System.out.println("Размер: " + queue.size());
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удаление некоторых элементов");
        for (int i = 0; i < 10; i++) {
            queue.dequeue();
        }
        System.out.println("Пусто? " + queue.isEmpty());
        System.out.println("Размер: " + queue.size());
        System.out.println("Первый элемент: " + queue.element());
        System.out.println("Удаление всех элементов");
        queue.clear();
        System.out.println("Пусто? " + queue.isEmpty());
    }
}
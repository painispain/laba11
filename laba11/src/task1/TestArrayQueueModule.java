package task1;

public class TestArrayQueueModule {
    public static void main(String[] args) {
        ArrayQueueModule module = new ArrayQueueModule();
        System.out.println("Пусто? "+module.isEmpty());
        System.out.println("Доб. элементы");
        for (int i = 0; i < 20; i++)
        {
            module.enqueue(i);
        }
        System.out.println("Пусто? "+module.isEmpty());
        System.out.println("Размер: "+module.size());
        System.out.println("Первый элемент: "+module.element());
        System.out.println("Удаление некоторых элементов");
        for (int i = 0; i < 10; i++) {
            module.dequeue();
        }
        System.out.println("Пусто? "+module.isEmpty());
        System.out.println("Размер: "+module.size());
        System.out.println("Первый элемент: "+module.element());
        System.out.println("Удаление всех элементов...");
        module.clear();
        System.out.println("Пусто? "+module.isEmpty());
    }
}

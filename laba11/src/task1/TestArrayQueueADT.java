package task1;

public class TestArrayQueueADT {
    public static void main(String[] args) {
        ArrayQueueADT adt = new ArrayQueueADT();
        System.out.println("Пусто? "+ArrayQueueADT.isEmpty(adt));
        System.out.println("Доб. элементы");
        for (int i = 0; i < 20; i++)
        {
            ArrayQueueADT.enqueue(adt, i);
        }
        System.out.println("Пусто? "+ArrayQueueADT.isEmpty(adt));
        System.out.println("Размер: "+ArrayQueueADT.size(adt));
        System.out.println("Первый элемент: "+ArrayQueueADT.element(adt));
        System.out.println("Удаление некоторых элементов");
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.dequeue(adt);
        }
        System.out.println("Пусто? "+ArrayQueueADT.isEmpty(adt));
        System.out.println("Размер: "+ArrayQueueADT.size(adt));
        System.out.println("Первый элемент: "+ArrayQueueADT.element(adt));
        System.out.println("Удаление всех элементов");
        adt.clear();
        System.out.println("Пусто? "+ArrayQueueADT.isEmpty(adt));
    }


}
package lab9.task08;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("Заполнение списка с головы:");
        list.createHead(values);
        System.out.println(list.toString());
        System.out.println("Заполнение списка с хвоста:");
        list.createTail(values);
        System.out.println(list.toString());
        System.out.println("Добавление элемента в начало списка:");
        list.addFirst(0);
        System.out.println(list.toString());
        System.out.println("Добавление элемента в конец списка:");
        list.addLast(6);
        System.out.println(list.toString());
        System.out.println("Добавление элемента в указанное место списка:");
        list.insert(2, 7);
        System.out.println(list.toString());
        System.out.println("Удаление первого элемента из списка:");
        list.removeFirst();
        System.out.println(list.toString());
        System.out.println("Удаление последнего элемента из списка:");
        list.removeLast();
        System.out.println(list.toString());
        System.out.println("Удаление элемента по индексу из списка:");
        list.remove(3);
        System.out.println(list.toString());
        MyLinkedList listHeadRec = new MyLinkedList();
        System.out.println("Заполнение списка с головы c помощью рекурсии:");
        listHeadRec.createHeadRec(values);
        System.out.println(listHeadRec.toString());
        MyLinkedList listTailRec = new MyLinkedList();
        System.out.println("Заполнение списка с хвоста с помощью рекурсии:");
        listTailRec.createTailRec(values);
        System.out.println(listTailRec.toString());
        System.out.println("Вывод списка с помощью рекурсии:");
        System.out.println(listTailRec.toStringRec());
    }
}
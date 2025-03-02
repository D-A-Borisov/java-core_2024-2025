package lab9.task08;

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private Node tail;

    public void createHead(int[] values) {
        head = null;
        tail = null;
        int i = 0;
        while (i < values.length) {
            Node newNode = new Node(values[i]);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            i++;
        }
    }
    public void createHeadRec(int[] values) {
        Node newNode = new Node(values[0]);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        if (values.length > 1) {
            int[] newValue = Arrays.copyOfRange(values, 1, values.length);
            createHeadRec(newValue);
        }
        return;
    }
    public void createTail(int[] values) {
        head = null;
        tail = null;
        int i = 0;
        while (i < values.length) {
            Node newNode = new Node(values[i]);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            i++;
        }
    }
    public void createTailRec(int[] values) {
        Node newNode = new Node(values[0]);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        if (values.length > 1) {
            int[] newValue = Arrays.copyOfRange(values, 1, values.length);
            createTailRec(newValue);
        }
        return;
    }
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void insert(int index, int value) {
        Node newNode = new Node(value);
        if (index == 0) {
            addFirst(value);
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            addLast(value);
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    public void removeFirst() {
        head = head.next;
    }
    public void removeLast() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    public void remove(int index) {
        Node current = head;
        int count = 0;
        while (count < index - 1) {
            current = current.next;
            count++;
        }
        current.next = current.next.next;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(" - ");
            }
            current = current.next;
        }
        return result.toString();
    }
    public String toStringRec() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        if (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(" - ");
                head = current.next;
                result.append(toStringRec());
            }
        }
        return result.toString();
    }
}
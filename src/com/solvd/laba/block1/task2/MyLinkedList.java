package com.solvd.laba.block1.task2;

public class MyLinkedList<T> {
    public class Node {
        T val;
        private Node next;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(T val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(T val) {
        if (isEmpty()) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(T val) {
        if (isEmpty()) {
            head = new Node(val);
            tail = head;
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int pos, T val) {
        if (pos == 1) {
            addFirst(val);
            return;
        }
        Node current = head;
        int count = 1;
        while (count < pos - 1) {
            count++;
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
    }

    public T deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        Node current = head;
        head = head.next;
        current.next = null;
        if (isEmpty()) {
            tail = null;
        }
        return current.val;
    }

    public T deleteLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (head == tail) {
            T val = head.val;
            head = null;
            tail = null;
        }
        Node current = head;
        Node prev = null;

        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        tail = prev;
        return current.val;
    }

    public T delete(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        if (pos == 1) {
            deleteFirst();
        }
        Node current = head;
        Node prev = null;
        int count = 1;
        while (count < pos) {
            count++;
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        return current.val;
    }

    public boolean search(T val) {
        Node current = head;
        while (current != null) {
            if (val == current.val) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public T get(int index) {
        Node temp = head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.val;
            }
            temp = temp.getNext();
            currentIndex++;
        }
        throw new IndexOutOfBoundsException();
    }
}

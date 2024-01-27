package hw1.exercise2;

import java.util.Random;

public class LinearSearchLinkedList {
    static class LinkedList {
        static class Node {
            int data;
            Node next;

            public Node(int element) {
                this.data = element;
            }
        }


       private Node head;
       private int n;

        public LinkedList(Node head) {
            this.head = head;
            n++;
        }

        public void add(int element) {
            Node node = new Node(element);
            if (head == null) {
                head = node;
                n++;
            }
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
            n++;
        }

        public int length() {
            return n;
        }

        public int get(int index) {
            if (index < 0 || index >= n || n == 0) return -1;
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        }
    }

    public static boolean search(LinkedList linkedList, int x) {
        for (int i = 0; i < linkedList.length(); i++) {
            if (x == linkedList.get(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList.Node head = new LinkedList.Node(0);
        LinkedList linkedList = new LinkedList(head);
        Random random = new Random();
        for (int i = 1; i < 10; i++) {
            linkedList.add(random.nextInt(0, 20));
        }
        for (int i = 0; i < linkedList.length(); i++) {
                System.out.print(linkedList.get(i)+ " ");
        }
        System.out.println("\n"+search(linkedList,10));
    }
}

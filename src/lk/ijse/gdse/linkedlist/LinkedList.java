package lk.ijse.gdse.linkedlist;


public class LinkedList {

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    private Node head;

    public void insertAtBegining(int data){
        Node node = new Node(data);
        node.next=head;
        head=node;
    }

    public void insertAtEnding(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printLinkedList() {
        Node temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }

    public void interstAtPosition(int data, int index) {
        Node newNode = new Node(data);

        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Invalid index");
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    public void deleteAtBegining() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from an empty list.");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnding() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from an empty list.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void deleteAtPosition(int index) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete from an empty list.");
            return;
        }
        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid index.");
            return;
        }
        current.next = current.next.next;
    }


}

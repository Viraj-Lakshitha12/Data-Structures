package lk.ijse.gdse.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insertAtBegining(10);
        list.insertAtBegining(20);
        list.insertAtBegining(30);


        list.insertAtEnding(40);
        list.insertAtEnding(50);

        list.printLinkedList();

        list.interstAtPosition(700,3);
        list.printLinkedList();
    }

}

package LinkedLists;

public class SingleLinkedList {

    public Node head;

    public void append(int value) {

        if(head == null){
            head = new Node(value);
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }

        current.next = new Node(value);
    }

    public void delete(int value) {

        if(head == null) return;

        if(head.value == value){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print(){

        if(head == null){
            System.out.println("END");
        }

        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

package LinkedLists;

// Eliminar duplicados de una lista enlazada
// input: 1 -> 2 -> 2 -> 3 -> 4 -> 1
// output: 1-> 2 -> 3 -> 4

import java.util.HashSet;

public class RemoveDups {

    public void execute(Node head){
        if(head == null) return;
        HashSet<Integer> values = new HashSet<Integer>();
        Node current = head;
        values.add(current.value);
        while(current.next != null){
            if(!values.add(current.next.value)){
                current.next = current.next.next;
            }
            current = current.next;
        }
    }
}

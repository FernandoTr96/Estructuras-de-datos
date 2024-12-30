package stacks_queues;

public class Queue {

    private Node start;
    private Node end;

    public void add(int value) {
        Node newNode = new Node(value);
        if(end != null){
            end.next = newNode;
        }
        end = newNode;
        if(start == null){
            start = end;
        }
    }

    public int remove() {
        if(start == null) throw new IllegalStateException("Queue is empty");
        int firstValue = start.value;
        start = start.next;
        if(start == null){
            end = null;
        }
        return firstValue;
    }

    public int pick() {
        if(start == null) throw new IllegalStateException("Queue is empty");
        return start.value;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int size() {
        if(start == null){
            throw new IllegalStateException("Stack is empty");
        }
        int count = 0;
        Node current = start;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
}

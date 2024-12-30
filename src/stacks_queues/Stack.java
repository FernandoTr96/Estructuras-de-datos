package stacks_queues;

public class Stack {

    private Node top;

    public void push(int value) {
         Node newNode = new Node(value);
         newNode.next = top;
         top = newNode;
    }

    public int pop() {
        if(top == null){
            throw new IllegalStateException("Stack is empty");
        }
        int topValue = top.value;
        top = top.next;
        return topValue;
    }

    public int pick() {
        if(top == null){
            throw new IllegalStateException("Stack is empty");
        }
        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size() {
        if(top == null){
            throw new IllegalStateException("Stack is empty");
        }
        int count = 0;
        Node current = top;
        while(current!=null){
            count++;
            current = current.next;
        }
        return count;
    }
}

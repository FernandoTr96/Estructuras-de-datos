package stacks_queues;

// Deque es una clase que trae java que permite usar colas y pilas directamente
import java.util.ArrayDeque;
import java.util.Deque;

public class QueuesWithStacks {

    Deque<Integer> firstStack = new ArrayDeque<>();
    Deque<Integer> secondStack = new ArrayDeque<>();

    public void add(Integer value) {
        firstStack.add(value);
    }

    public Integer peek() {
        dumpElementsIntoSecondStack();
        return secondStack.peek();
    }

    public Integer remove() {
        dumpElementsIntoSecondStack();
        return secondStack.pop();
    }

    public boolean isEmpty() {
        return firstStack.isEmpty();
    }

    public int size() {
        return firstStack.size();
    }

    private void dumpElementsIntoSecondStack(){
        if(secondStack.isEmpty()){
            while(!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
        }
    }
}

package stacks_queues;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * Ordena un Stack de forma que los elementos más pequeños queden en el tope del Stack.
 * Puedes usar un Stack adicional, pero no está permitido copiar los elementos a otra
 * estructura de datos.
 *
 * Ejemplo:
 *   Input: (tope) 5->1->4->2
 *  Output: (tope) 1->2->4->5
*/

public class SortStack {

    public Deque<Integer> sort(Deque<Integer> stack) {

        int current = 0;
        Deque<Integer> orderedStack = new ArrayDeque<>();

        while(!stack.isEmpty()){
            current =  stack.pop();
           while(!orderedStack.isEmpty() && current > orderedStack.peek()){
               stack.push(orderedStack.pop());
           }
           orderedStack.push(current);
        }

        return orderedStack;
    }
}
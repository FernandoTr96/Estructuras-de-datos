package stacks_queues;

/*
 * Dado un String que solamente contiene los caracteres '(', ')', '{', '}', '[' y ']',
 * implementa un algoritmo para determinar si es válido.
 *
 * Ejemplo 1:
 *  Input: "([]){}"
 *  Output: true
 *
 * Ejemplo 2:
 *  Input: "({)}"
 *  Output: false
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {

    public boolean isValid(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for(Character c : str.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(getOpposite(c));
            }
            else{
                if(stack.isEmpty() && c != stack.pop()) return false;
            }
        }

        return stack.isEmpty();

    }

    private Character getOpposite(Character c) {
        return switch (c) {
            case '(' -> ')';
            case '{' -> '}';
            case '[' -> ']';
            default -> '0';
        };
    }
}

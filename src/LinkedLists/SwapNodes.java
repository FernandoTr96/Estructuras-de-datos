package LinkedLists;
/*
 * Escribe un algoritmo que intercambie parejas de nodos adyacentes sin
 * modificar el valor interno de los nodos.
 *
 * Ejemplo:
 *  Input: 1->2->4->6->8
 * 4->6->8
 * 1 -> 2 -> 1->2->4->6->8
 * 2 -> 1
 *  Output: 2->1->6->4->8
 */
public class SwapNodes {

    public Node swapNodesInPairs(Node head) {

        if (head == null || head.next == null) return head;

        Node tmp = head.next.next;
        head.next.next = head;
        head = head.next;
        head.next.next = swapNodesInPairs(tmp);
        return head;
    }
}

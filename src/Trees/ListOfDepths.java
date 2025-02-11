package Trees;
import java.util.LinkedList;
import java.util.List;

/*
 * Implementa un algoritmo que devuelva una lista enlazada con los nodos de cada nivel. Si el árbol tiene
 * N niveles debes devolver N listas enlazadas.
 *
 * Ejemplo:
 *  Input:
 *        4
 *     2     7
 *   1   3  6  9
 *
 *  Output:
 *    4
 *    2->7
 *    1->3->6->9
 */
public class ListOfDepths {


    public List<LinkedList<Node>> listOfDepths(Node root) {

        List<LinkedList<Node>> result = new LinkedList<>();
        if (root == null) return result;

        LinkedList<Node> currentLevel = new LinkedList<>();
        currentLevel.add(root);

        while (!currentLevel.isEmpty()) {

            result.add(currentLevel);
            LinkedList<Node> parents = currentLevel;
            currentLevel = new LinkedList<>();

            for(Node node : parents) {
                if(node.left != null){
                    currentLevel.add(node.left);
                }
                if(node.right != null){
                    currentLevel.add(node.right);
                }
            }
        }

        return result;
    }
}
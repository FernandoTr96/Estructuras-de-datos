package HashTables;
import java.util.*;

// anagramas agrupados

public class GroupAnagrams {

    public  List<List<String>> group(String[] words){
        Map<String, List<String>> anagramMap = groupByHash(words);
        return new ArrayList<>(anagramMap.values());
    }

    // Funcion para agrupar las palabras segun el hash generado, si son hash iguales son anagramas
    // Por lo que el mismo hash tendra el array list de palabras
    private Map<String, List<String>> groupByHash(String[] words){
        // Recipiente de anagramas
        Map<String, List<String>> anagrams = new HashMap<String,List<String>>();
        // Por cada palabra hay un hash
        for(String word : words){
            String hash = generateHash(word);
            // Si el hash no existe en el mapa inicializarlo vacio
            if(!anagrams.containsKey(hash)){
                anagrams.put(hash, new ArrayList<String>());
            }
            // Si encuentra un hash inicializado ingresar la palabra
            anagrams.get(hash).add(word);
        }
        return anagrams;
    }

    // Generar un hash o identificador para cada palabra, ya que ordenarlos o usar for es mas pesado
    // Si se genera el identificador los charset que tengan las mismas letras tendran el mismo hash
    private String generateHash(String word){
        // Array para guardar los valores del hash, este es del tamanio del alfabeto debido a que estamos evaluando letras
        int[] hash = new int[27];
        // Recorrer la palabra para que se aumente el contador de cada caracter calculando su posicion
        // Las posiciones con como el alfabeto en el array a es 0, b es 1, c es 2 y asi
        for (char c : word.toCharArray()){
            hash[c - 'a']++;
        }
        // devolvemos el array con los conteos en string
        return Arrays.toString(hash);
    }
}

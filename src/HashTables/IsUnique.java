package HashTables;
import java.util.HashSet;
import java.util.Set;

// Dado un metodo que recibe una string, comprobar si todos los caracteres son unicos o no.
// Dado que segun el codigo ascii tiene entre 128 caracteres sabemos que si la longitud de la cadena es mayor va haber repetidos.
// Por tanto si bien la complejidad pareciera ser O(n) al final por ese detalle seria O(1).
// Pasra usar hashtables tenemos los hashmap (clave y valor) y set (valores sin repetir).

public class IsUnique {

    private  static int ASCII_CHARACTERS_NUMBER = 128;

    public static boolean checkCharacters(String str) {
        // si la longitud de la cadena es mayor que el numero de caracteres ASCII, es que hay repetidos
        if(str.length() > ASCII_CHARACTERS_NUMBER) return false;
        // primero declaramos el hashTable donde se guardaran aquellos valores unicos
        Set<Character> uniqueCharacters = new HashSet<Character>();
        // luego recorremos el string para ir almacenando aquellos valores que no esten en el hashTable
        for(Character c : str.toCharArray()){
            if(uniqueCharacters.contains(c)) return false;  // si ya esta en el hashmap, devuelve false
            uniqueCharacters.add(c);
        }
        // si llegamos hasta aqui es que todos los caracteres son unicos, devolvemos true
        return true;
    }
}

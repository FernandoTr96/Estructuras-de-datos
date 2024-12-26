import HashTables.IsUnique;
import HashTables.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // hash tables examples
        System.out.println("abcde is unique ? "+IsUnique.checkCharacters("abcde"));
        System.out.println("abcded is unique ? "+IsUnique.checkCharacters("abcded"));
        System.out.println("[9,2,5,6] indices de los pares que den 7: "+ Arrays.toString(TwoSum.check(new int[]{9, 2, 5, 6}, 7)));
    }
}


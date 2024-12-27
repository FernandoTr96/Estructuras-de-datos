import HashTables.GroupAnagrams;
import HashTables.IsUnique;
import HashTables.TwoSum;
import HashTables.ZeroMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // hash tables examples
        System.out.println("abcde is unique ? "+IsUnique.checkCharacters("abcde"));
        System.out.println("abcded is unique ? "+IsUnique.checkCharacters("abcded"));
        System.out.println("[9,2,5,6] indices de los pares que den 7: "+ Arrays.toString(TwoSum.check(new int[]{9, 2, 5, 6}, 7)));
        System.out.println("anagramas: "+ new GroupAnagrams().group(new String[]{"saco","arresto","programa","rastreo","caso"}).toString());
        System.out.println("matrix zero: ");
        new ZeroMatrix().zeroMatrix(
                new int[][] {
                        {2, 1, 3, 0, 2},
                        {7, 4, 1, 3, 8},
                        {4, 0, 1, 2, 1},
                        {9, 3, 4, 1, 9}
                }
        );
    }
}


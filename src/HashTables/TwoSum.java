package HashTables;
import java.util.HashMap;

// Dado un array de numeros y un target, retorna los indices de dos numeros para los que la suma de ambos sea igual al target

public class TwoSum {
    public static int[] check(int[] numbers, int target){
        if(numbers.length < 2) return null;
        HashMap<Integer,Integer> complements = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            int complement = target - number;
            if(complements.containsKey(number)) return new int[]{i,complements.get(number)};
            complements.put(complement, i);
        }
        return null;
    }
}



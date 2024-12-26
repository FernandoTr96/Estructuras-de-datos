import HashTables.IsUnique;

public class Main {
    public static void main(String[] args) {

        // hash tables examples
        System.out.println("abcde is unique ? "+IsUnique.checkCharacters("abcde"));
        System.out.println("abcded is unique ? "+IsUnique.checkCharacters("abcded"));
    }
}
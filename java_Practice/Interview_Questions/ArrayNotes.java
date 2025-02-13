
import java.util.Arrays;

public class ArrayNotes {

    public static String factsAboutArrays() {
        String fact1 = "the runtime complexity for lookup is O(1)";
        String fact2 = "Arrays are static data structures. Allocated sizes are specified and cannot change";
        String fact3 = "adding an item to the array requires resizing the array and copying all of the old items into new Array";
        String fact4 = "Insert an item into an array has runtime complexity of O(n). Increases the cost of linearly and in direct proportion to the sizeo the array";
        String fact5 = "Always think of the worst case scenario when big O analysis.";
        String fact6 = "Deleting an item from the array requires shifting items to the left of the array. Deletion is an O(n)";
        return fact1 + "\n " + fact2 + "\n " + fact3 + "\n " + fact4 + "\n" + fact5 + "\n" + fact6;
    }

    public static void generateArray() {
        String arrayInitialization = "all initialized values are 0 if you are doing a numerical array";
        System.out.println(arrayInitialization);
        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = new int[3];
        numbers1[0] = 23;
        numbers1[1] = 24;
        numbers1[2] = 25;
        System.out.println("number1 array has three separate index specified with a value");
        System.out.println(Arrays.toString(numbers1));

        int[] numbers2 = {45, 46, 47};
        System.out.println("number2 array is declared on one line with 3 values specified");
        System.out.println(Arrays.toString(numbers2));
    }


    public static void main(String[] args) {

        System.out.print(factsAboutArrays());
        generateArray();
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(100));
        numbers.print();

    }

}

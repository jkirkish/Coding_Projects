
public class BigOMain {

    public static void main(String[] args) {
        int[] numbers = {5, 4, 2, 3, 1, 8, 9, 7, 6, 10};

        BigOnotes notes = new BigOnotes();

        notes.ArrayConstantTime(numbers);
        notes.bigO_of_N(numbers);
        notes.nestedLoops(numbers);

        int linear = notes.linearSearch(numbers, 7);
        System.out.println(linear);
        int binary = notes.binarySearch(numbers, 7);
        System.out.println(binary);
        int recursiveResult = notes.fibonacci(5);
        System.out.println(recursiveResult);

    }
   
}

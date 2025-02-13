
public class BigOnotes {

    private String whatIsBigOnNotation = "Big O notation is a mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity";
    private String whenBigOIsUsed = "We use Big O notation to describe the performance of an algorithm";
    private String theBigOGoal = "Determine how the algorithm will scale well as the input grows really large";
    private String BigOandDataStructures = "accessing, removing or adding items, updating items in a data structure can be costly on performance";

    //(O)1 runs in constant time
    public void ArrayConstantTime(int[] numbers) {

        String constantTime = "This method has a runtime complexity of Big O(1) or constant time";
        String sizeOfInput = "The size of the input doesn't matter in this case for constant time";
        String duplicatePrintOut = "The runtime complexity is Big 0 of 2 with two print statements";
        String importantNote = "The goal is to figure out how much an algorithm slows down as the input grows larger";
        String endResult = "No matter how many operations, O(1) runtime complexity runs in constant time no matter if the input is 1 or 1 million items";
        String spaceComplexity = "space complexity is only the additional space that we should allocate relative to the size of the input";
        System.out.println(constantTime + " " + sizeOfInput);
        System.out.println(duplicatePrintOut);
        System.out.println(importantNote);
        System.out.println(endResult);
        System.out.println(numbers[0]);
    }

    //O(n) linear growth
    public void bigO_of_N(int[] numbers) {
        String bigO_N = "the cost of this algorithm grows linearly and in direct correlation to the size of the input";
        String n = "n is the size of the input.";
        String grows = "As n grows, the cost of this algorithm also grows linearly";
        String forloops = "if you have 2 or more loops, you drop the constant and the runtime complexity is still 0(n)";
        String whatsNeeded = "All we need is an approximation of this algorithm relative to it's input size";
        String parameters = "having 2 or more parameters in this method still keeps big 0 at 0(n)";
        System.out.println(bigO_N + "\n " + n + "\n " + grows + "\n " + forloops + "\n " + whatsNeeded);
        System.out.println(parameters);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[1]);
        }
    }

    //O(n^2) quadratic growth
    public void nestedLoops(int[] numbers) {
        String nestedRunTimeComplexity = "each nested for loop raises the Big O notation one more exponent";
        String Quadratic = "One for loop nested in an outer for loop has Big O notation of O(n^2) or quadratic time";
        System.out.println(nestedRunTimeComplexity + " " + Quadratic);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + ". Testi ");
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(j + ". Testj");
            }
        }
    }

    //O((n) linear growth
    public int linearSearch(int[] numbers, int target) {
        String linear = "An Algorithm that runs in logarithic time is more efficient and scalable than linear or quadratic time ";
        String linearSearches = "linear search is linear growth and is not as efficient as binary search";
        System.out.print(linear + " \n " + linearSearches);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i; // Return the index where the target is found
            }
        }
       
        return -1; // Return -1 if the target is not found
    }

    //O(log n)
    public int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        String BinarySearches = "Binary Search repeatly halves the search space with precondition everything is sorted";
        String BinaryFact1 = "requiring logarithmic  O(log n) comparisons relative to the size of the array";
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid; // Return the index where the target is found
            }
            if (numbers[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
    }

        return -1; // Return -1 if the target is not found
    }
     //O(2 ^n) exponential growth rate
     public int fibonacci(int n){
        String recursion = "exponential time complexity grows exponentially with the size of the input";
        System.out.println(recursion);
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}

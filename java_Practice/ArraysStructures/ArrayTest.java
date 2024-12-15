package ArraysStructures;

public class ArrayTest {

    public static void main(String[] args) {
        // Create an Array instance with an initial size of 3
        Array array = new Array(5);

        // Test the insert method
        System.out.println("Testing insert method:");
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.insert(60);// Tests dynamic resizing
        array.print();
        System.out.println();

        // Test the removeAt method
        System.out.println("Testing removeAt method:");
        array.removeAt(1); // Removes the item at index 1 (20)
        array.print();
        System.out.println();

        // Test the indexOf method
        System.out.println("Testing indexOf method:");
        System.out.println("Index of 10: " + array.indexOf(10)); // Should print 0
        System.out.println("Index of 30: " + array.indexOf(30)); // Should print 1
        System.out.println("Index of 50: " + array.indexOf(50)); // Should print -1
        System.out.println();

        // Test the print method
        System.out.println("Testing print method:");
        array.print();
    }
}

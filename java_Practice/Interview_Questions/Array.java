
public class Array {

    private int[] items; //global variable for the items array
    private int count; //establishes how many items are in the items array

    public Array(int length) {
        //constructor to initialize the the size of the items array
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            /*if the array is full we increase it by size * 2 to make more space 
             * we add items at the end
             * we create a new array that is twice the size and copy 
             * everything from the old array.  
             * 
             */
            int[] newItems = new int[count * 2];
            /*
             * after the array is increased in size we copy of the old items to new items
             */
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        // we can increment count with count++ because we are inserting an item into the array
        //inserting an item is an O(n) operation
        items[count++] = item;
    }
    public int getItem(int index){
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }for (int i = 0; i < count; i++) {
            if(index == items[i]){
                return items[i];
            }
        }
        return -1;
    }
    public void removeAt(int index) {

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
       //deleting an item is O(n)
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }

        return -1;
        //lookup by value is O(N) operation
    }

    public void print() {
        /*A for loop can iterate through all items in the array and print them
        / A count method is used in the for loop, not items.length.  
        Count represents the total amount of items that exist with one item per index.
        when you add item, we can increment count by 1, 
        when we delete an item we can decrement count by 1
        we can initialize count to 0 so that it won't execute the for loop below until 
        something is already present in the for loop.
         */
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}

public class SelectionSort{
    
public static void main(String [] main){

    int[] array = {10,9,8,7,6,5,4,3,2,1};
    displayArray(array);
    selectionSort(array);
    displayArray(array);

}
public static void displayArray(int [] array){

    for(int index = 0; index <= array.length -1; index++){
        
            System.out.print(array[index] + ",");
        }

}

public static void selectionSort(int [] arr){

    int n = arr.length;

    for (int i = 0; i < n-1; i++)
    {
        int minIndex = i;
        for(int j= i + 1; j < n; j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
    

        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;

    }
}
}

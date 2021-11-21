package Sorting;

//Time complexity O(N^2). However, it is generally fast than bubble and selection sorts.
//If acting on an already sorted array, it's O(N). But if acting on reverse sorted, it's as bad as bubble sort.
//Previously inserted elements will be at left end. We pick the next element that hasn't been inserted
//and insert it amongst the previously inserted ones.
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int insertMe;       //Element to be inserted
        int currIdx;        //Index of current element to be inserted
        int insertedIdx;    //Index of an element that's already been inserted

        for (currIdx = 1; currIdx < arr.length; currIdx++) {    //Start at second element (we'll compare it to the first)
            insertMe = arr[currIdx];    //Make a copy of current element (currIdx will be used when shifting previously inserted elements rightward)

            insertedIdx = currIdx - 1;      //Index of the last element that was inserted (or 0 if on first iteration)

            while(insertedIdx >= 0 && arr[insertedIdx] > insertMe) {    //Iterate leftward through the previously inserted elements, stopping if element is smaller than that to be inserted
                arr[insertedIdx + 1] = arr[insertedIdx];                //Shift previously inserted element rightward
                insertedIdx--;
            }
            arr[insertedIdx + 1] = insertMe;                                //Insert into correct position (relative to previously inserted elements)
        }
    }


    public static void main(String[] args) {
        int[] arr = { 13, 6, 76, 35, 8, 14 };
        System.out.println("Before: ");
        displayArr(arr);

        insertionSort(arr);

        System.out.println("After: ");
        displayArr(arr);
    }


    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

}

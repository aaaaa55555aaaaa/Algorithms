package Sorting;

//Time complexity O(N^2). However, faster than bubble sort, because only one swap is necessary per pass.
//Sorts integers into ascending order, by moving smaller elements to the start
public class SelectionSort {
    public static void selectionSort(int[] arr) {

        int idxMin; //index of smallest element

        //Each iteration of outer loop is one pass
        for (int i = 0; i < arr.length - 1; i++) {
            idxMin = i;   //Treat the first unsorted element as the smallest

            //Find index of smallest unsorted element
            for (int j = i + 1; j < arr.length; j++) {  //
                if (arr[j] < arr[idxMin]) {
                    idxMin = j;
                }
            }
            swap(arr, i, idxMin); //Move the smallest unsorted element to end of sorted elements
        }
    }


    public static void main(String[] args) {
        int arr[] = { 6, 13, 76, 35, 8, 14 };
        System.out.println("Before: ");
        displayArr(arr);

        selectionSort(arr);

        System.out.println("After: ");
        displayArr(arr);
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void displayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}

package Sorting;

//Time complexity O(N^2)
//This implementation sorts integers into ascending order
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {           //The elements at indexes > i are already sorted

                //Swap elements if the left one was larger than the right
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = { 6, 13, 76, 35, 8, 14 };
        System.out.println("Before: ");
        displayArr(arr);

        bubbleSort(arr);

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
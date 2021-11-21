package Searching;

//Time complexity O(N)
public class LinearSearch {
    //Method to return index at which element is found, or else -1
    public static int linearSearch(int[] arr, int x){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }


    //Test that it works
    public static void main(String[] args) {
        int arr[] = { 6, 13, 76, 35, 8, 14 };
        int x = 8;

        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println(x + " was not present in the array");
        } else {
            System.out.println(x + " was found at index " + result);
        }
    }
}

//Time complexity O(log n)
//Searches a SORTED array for a particular element
public class BinarySearch {
    public static int binarySearch(int arr[], int x) {
        //Declare left and right boundaries of search range, and midpoint
        int left = 0;
        int mid;
        int right = arr.length - 1;

        while (left <= right) {
            mid = (right - left)/2 + left;  //Index of midpoint is half the range + index of left boundary

            if (arr[mid] == x)
                return mid;                 //Element found

            if (arr[mid] < x)
                left = mid + 1;             //Reduce range to only right half

            else
                right = mid - 1;            //Reduce range to only left half
        }

        return -1;                          //Element not found
    }


    //Test that it works
    public static void main(String[] args) {
        System.out.println("running");
        int arr[] = { 6, 8, 13, 14, 35, 76 };
        int x = 8;

        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println(x + " was not present in the array");
        } else {
            System.out.println(x + " was found at index " + result);
        }
    }
}

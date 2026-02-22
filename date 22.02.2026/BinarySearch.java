import java.util.Arrays;

public class BinarySearch {

    public static boolean element(int arr[], int key) {
        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr, key);
        return res >= 0;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 2, 6, 10};
        int key = 17;

        boolean res = element(arr, key);

        System.out.println("Is " + key + " present in the array? " + res);
    }
}

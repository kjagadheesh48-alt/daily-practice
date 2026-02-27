public class swapusingarray{


    public static void swapArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void main(String[] args) {

        int[] num = {9, 5};

        System.out.println("Before swapping: m=" + num[0] + ", n=" + num[1]);

        swapArray(num);

        System.out.println("After swapping using array: m=" + num[0] + ", n=" + num[1]);
    }
}
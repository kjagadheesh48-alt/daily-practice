import java.util.*;

class removeElement{

    public int removeElement(int[] num, int val) {
        int in = 0;

        for(int i = 0; i < num.length; i++) {
            if(num[i] != val) {
                num[in++] = num[i];
            }
        }

        return in;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        Solution obj = new Solution();

        int newLength = obj.removeElement(arr, val);

        System.out.println("New length: " + newLength);

        System.out.print("Array after removing element: ");
        for(int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
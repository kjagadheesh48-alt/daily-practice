import java.util.Scanner;
    public class element{
        static boolean isemlement(int arr[],int key)
{
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return true;
        }
    }
    return false;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the arrary");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+"elements;");
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int key=sc.nextInt();

        if (isemlement(arr, key)) {
            System.out.println(key + " is present in the array.");
        } else {
            System.out.println(key + " is NOT present in the array.");
        }


    }
}
    
public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7};
        int key = 5;

        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
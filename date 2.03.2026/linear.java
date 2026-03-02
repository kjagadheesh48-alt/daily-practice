public class linear{
    public static boolean linear(int[] arr,int key){
        for(int element : arr){
            if(element == key){
                return true;
            }
        }
            return false;
    }
    public static void main(String[] args) {
        int [] arr={3,4,7,6,10};
        int key=7;
        boolean res=linear(arr,key);
         System.out.println("Is " + key + " present in the array: "+res);
    }
}

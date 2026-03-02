import java.util.Arrays;
public class arrays_linear{
    public static boolean arrays_linear(Integer[] arr,int key){
        return Arrays.asList(arr).contains(key);
    }
    public static void main(String[] args){
        Integer[] arr={3,5,7,2,6,10};
        int key=7;
        boolean res=arrays_linear(arr,key);
        System.out.println("Is " + key + " present in the array: "+res);
    }
}
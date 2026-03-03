import java.util.Arrays;
public class sorting_reversing{
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        Arrays.sort(a);
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] a){
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int t=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=t;
        }
        
    }
}
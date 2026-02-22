import java.util.*;
public class sort{
    public static void main(String[] args){
          Integer a[] = { 1, 2, 3, 4, 5 };

        
        Arrays.sort(a, Collections.reverseOrder());

        System.out.println(Arrays.toString(a));
    }
}

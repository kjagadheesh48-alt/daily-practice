import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        int i = str.length()-1;
        while(i>=0){
            rev += str.charAt(i);
            i--;
        }
        System.out.println(rev);
    }
}
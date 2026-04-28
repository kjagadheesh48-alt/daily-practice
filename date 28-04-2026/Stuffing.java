import java.util.*;

public class Stuffing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary data: ");
        String data = sc.nextLine();
        String bit = "";
        int c = 0;

        for (char ch : data.toCharArray()) {
            bit += ch;
            if (ch == '1') {
                c++;
                if (c == 5) {
                    bit += '0';
                    c = 0;
                }
            } else c = 0;
        }
        System.out.print("Enter character data: ");
        String d = sc.nextLine();
        char F = 'F', E = 'E';
        String byt = "" + F;

        for (char ch : d.toCharArray()) {
            if (ch == F || ch == E) byt += E;
            byt += ch;
        }
        byt += F;
        System.out.println("Bit Stuffed: " + bit);
        System.out.println("Byte Stuffed: " + byt);
    }
}
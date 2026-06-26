public class java21 {
    public static void main(String[] args) {
        int a = 88;
        String s = Integer.toBinaryString(a);
        System.out.println(s);
        int ones = 0;
        for (char c : s.toCharArray()) {
            System.out.println(c);
            if (c == '1') ones++;
        }
        int zeros = s.length() - ones;
        System.out.println("Number of 1's: " + ones);
        System.out.println("Number of 0's: " + zeros);
        
    }
    
}

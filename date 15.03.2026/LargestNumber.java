public class LargestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;

        if (a > b && a > c) {
            System.out.println("A is the largest number");
        } 
        else if (b > a && b > c) {
            System.out.println("B is the largest number");
        } 
        else {
            System.out.println("C is the largest number");
        }
    }
}
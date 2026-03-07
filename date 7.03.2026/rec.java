class rec {
    static int calculatePerimeter(int l, int b) {
        return 2 * (l + b);
    }
    public static void main(String[] args) {

        int l = 10;
        int b = 20;

        int perimeter = calculatePerimeter(l, b);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
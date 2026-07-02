public class java75{
    public static void main(String[] args) {
        int a[] = {1, 56, 85, 9, 656};

        int m= a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }

        System.out.println("Maximum value = " + m);
    }
}
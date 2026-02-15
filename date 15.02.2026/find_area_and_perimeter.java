import java.util.Scanner;
public class find_area_and_perimeter{
    static void rectangle_area_and_perimeter(int l, int b){
        int area = l*b;
        System.out.println("Area of rectangle is: "+area);
        int perimeter = 2*(l+b);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }
    static void circle_area_and_perimeter(int r){
        double area = 3.14*r*r;
        System.out.println("Area of circle is: "+area);
        double perimeter = 2*3.14*r;
        System.out.println("Perimeter of circle is: "+perimeter);
    }
    static void  square_area_and_perimeter(int s){
        int area = s*s;
        int perimeter = 4*s;
        System.out.println("Area of square is: "+area);
        System.out.println("Perimeter of square is: "+perimeter);
    }
    static void triangle_area_and_perimeter(int l, int b,int c){
        int area = (l*b)/2;
        System.out.println("Area of triangle is: "+area);
        int perimeter = l+b+c;
        System.out.println("Perimeter of triangle is: "+perimeter);

    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=1;
    while(n==1){
        System.out.println("Enter the shape you want to calculate the area and perimeter for:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.println("5. Exit");
        int f = sc.nextInt();
        switch(f){
            case 1:
                System.out.println("Enter the length of the rectangle:");
                int a = sc.nextInt();
                System.out.println("Enter the breadth of the rectangle:");
                int b = sc.nextInt();
                rectangle_area_and_perimeter(a,b);
                break;
            case 2:
                System.out.println("Enter the radius of the circle:");
                int r = sc.nextInt();
                circle_area_and_perimeter(r);
                break;
            case 3:
                System.out.println("Enter the side of the square:");
                int s = sc.nextInt();
                square_area_and_perimeter(s);
                break;
            case 4:
                System.out.println("Enter the length of the triangle:");
                int c = sc.nextInt();
                System.out.println("Enter the breadth of the triangle:");
                int d = sc.nextInt();
                System.out.println("Enter the third side of the triangle:");
                int e = sc.nextInt();
                triangle_area_and_perimeter(c,d,e);
                break;
            case 5:
                System.out.println("Exiting the program.");
                n=0;
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
        }
    }
}
}
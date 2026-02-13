import java.util.Scanner;
public class Calculator {
static void  calculateSum(int a, int b) {
    char oper;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the operator(+,-,*,/):");
    oper=sc.next().charAt(0);
    double result;
    double num1,num2;
    System.out.println("Enter first number:");
    num1=sc.nextDouble();
    System.out.println("Enter second number:");
    num2=sc.nextDouble();
    switch(oper)
    {
        case '+':
            result=num1+num2;
            System.out.println("The sum is:"+result);
            break;
            case '-':
            result=num1-num2;
            System.out.println("The difference is:"+result);
    case '*':
            result=num1*num2;
            System.out.println("The product is:"+result);
    case '/':
            if(num2!=0)
            {
                result=num1/num2;
                System.out.println("The quotient is:"+result);
            }
            else
            {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
 default:
            System.out.println("Invalid operator!");
        
}
}
public static void main(String[] args){
    int a=0,b=0;
    calculateSum(a,b);
}
}

public class biggest_number{
    public static int biggestOfThree(int x,int y,int z){
        return z>(x>y?x:y)?z:((x>y)?x:y);
    }
    public static void main(String[] args){
        
        int largest;
        int a=5;
        int b=10;
        int c=3;
        largest =biggestOfThree(a,b,c);
        System.out.println(largest +" is the largest number.");


    }
}
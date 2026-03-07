import java.io.*;
public class compound {
    public static void main(String[] args){
        double principal = 1000,rate =10.5,time=5;
        double ci=principal*(Math.pow((1+rate/100),time));
        System.out.println("Compund Interest"+ci);
    }
    
}

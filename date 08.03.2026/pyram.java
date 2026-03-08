import java.io.*;
class pyram{
    public static void main(String[] args){
        int num=7;
        int i=num,j;
        while(i>0){
            j=0;
            while(j++ < num-i){
                System.out.print(" ");
            }
            j=0;
            while(j++<(i*2)-1){
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}
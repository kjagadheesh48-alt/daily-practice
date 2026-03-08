public class pyram_2{
    public static void main(String[] args){
        int num=7;
        int i = num,j;
        do{
            j=0;
            do{
                System.out.print(" ");
            }
            while (j++<num-i);
            j=0;
            do{
                System.out.print("*");
            }
            while(j++<i*2-2);
            System.out.println("");
        }
        while(--i>0);
    }
}
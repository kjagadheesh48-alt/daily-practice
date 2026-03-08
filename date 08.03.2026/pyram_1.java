class pyram_1{
    public static void main(String[] args){
        int num=7;
        int i,j;
        for(i=num;i>=1;i--){
            for(j=i;j<num;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
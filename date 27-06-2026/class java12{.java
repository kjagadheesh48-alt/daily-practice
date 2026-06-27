class java12{
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int c=0;
        for(int b=0;b<=a.length-1;b++){
            c=c+a[b];
        }
        System.out.println(c);
        System.err.println(c/a.length);

        
    }
}
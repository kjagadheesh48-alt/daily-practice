class GFG{
    static void dectobinary(int n){
        int[] binarynum= new int[1000];
        int i=0;
        while(n>0){
            binarynum[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binarynum[j]);
        }}
        public static void main(String args[]){
            int n=23;
            System.out.print("Binary of "+n+" is: ");
            dectobinary(n);
        }
    }

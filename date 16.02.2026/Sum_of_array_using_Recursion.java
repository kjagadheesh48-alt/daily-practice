class Sum_of_array_using_Recursion{
    static int sum(int[] arr, int n){
        if(n==0){
            return 0;
        }
        return arr[n-1]+sum(arr,n-1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int result=sum(arr,n);
        System.out.println("The sum of the array is: "+result);
}
}
class sum_of_array{
    static int sum_1(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
        public static void main(String[] args){
            int arr[]={112,23,34,45,56};
            int result=sum_1(arr);
            System.out.println("The sum of the array is: "+result);
        }

}
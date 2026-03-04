public class loop_array{
public static void loop_array(){
    int [][]arr={{1,2,3},{4,5,6}};
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();    
    }
}
public static void main(String[] args){
    loop_array();
}
}
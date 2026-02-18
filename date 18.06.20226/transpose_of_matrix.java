class transpose_of_matrix {
  
    static void transpose_of_matrix(int A[][], int B[][]) {
              int n=4;
            int m=3;
        for(int i=0;i<n;i++){
     
            for(int j=0;j<m;j++){
                B[i][j] = A[j][i];
        }
    }
}

    public static void main(String[] args){
        int A[][] = {{1,1,1,1},
                        {2,2,2,2},
                        {3,3,3,3}};
               int n=4;
                int m=3;

        int B[][] = new int[n][m];
        transpose_of_matrix(A,B);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(B[i][j]);
        }
        System.out.println();

    }
}
}

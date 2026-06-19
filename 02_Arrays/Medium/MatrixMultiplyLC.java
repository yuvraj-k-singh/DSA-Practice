/*
WAP: Matrix Multiply Leetcode
Time Complexity: O(n*3)
Space Complexity: O(n*2)
Date: 19-June-2026
*/

public class MatrixMultiplyLC {
    public static void main(String[] args) {
        int[][] a = {{7,8},{2,9}};
        int[][] b = {{14,5},{5,18}};

        int[][] c = matrixMultiplyLC(a, b);

        System.out.println("Matrices answer: ");
        for(int[] arr : c){
            for(int x : arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplyLC(int[][] a, int[][] b){
        int n = a.length;
        int[][] c = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                c[i][j] = 0;
                for(int k=0; k<n; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        return c;
    }
}

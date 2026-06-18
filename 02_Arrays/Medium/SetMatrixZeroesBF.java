/*
WAP: Set Matrix Zeroes BF
Time Complexity: O(n*3)
Space Complexity: O(1)
Date: 01-apr-2026
*/

public class SetMatrixZeroesBF {
    public static void main(String[] args){
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        System.out.println("Matrix before: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        setMatrixZeroBF(arr);

        System.out.println("\nMatrix After: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void setMatrixZeroBF(int[][] arr){
        int m = arr.length, n = arr[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0){
                    markRow(arr, i);
                    markCol(arr, j);
                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    private static void markRow(int[][] arr, int i){
        for(int j=0; j<arr[0].length; j++){
            if(arr[i][j] != 0) arr[i][j] = -1;
        }
    }

    private static void markCol(int[][] arr, int j){
        for(int i=0; i<arr.length; i++){
            if(arr[i][j] != 0) arr[i][j] = -1;
        }
    }
}

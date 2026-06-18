/*
WAP: Set Matrix Zeroes BS
Time Complexity: O(n*2)
Space Complexity: O(N)
Date: 01-apr-2026
*/

public class SetMatrixZeroesBS {
    public static void main(String[] args){
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        System.out.println("Matrix before: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        setMatrixZeroBS(arr);

        System.out.println("\nMatrix After: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void setMatrixZeroBS(int[][] arr){
        int m = arr.length, n = arr[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] == 0){
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        for(int i=0; i<m; i++){
            if(row[i] == -1){
                for(int j=0; j<n; j++) arr[i][j] = 0;
            }
        }

        for(int j=0; j<n; j++){
            if(col[j] == -1){
                for(int i=0; i<m; i++) arr[i][j] = 0;
            }
        }
    }
}

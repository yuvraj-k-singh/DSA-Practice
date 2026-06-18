/*
WAP: Rotate Matrix ClockWise BF
Time Complexity: O(n*2)
Space Complexity: O(n*2)
Date: 01-apr-2026
*/

public class RotateMatrixClockWiseBF {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix before: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        int[][] c = rotateMatrixCWBF(arr);

        System.out.println("\nMatrix After: ");
        for(int[] a : c){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrixCWBF(int[][] arr){
        int[][] c = new int[arr.length][arr[0].length];
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                c[j][n-1-i] = arr[i][j];
            }
        }
        return c;
    }
}

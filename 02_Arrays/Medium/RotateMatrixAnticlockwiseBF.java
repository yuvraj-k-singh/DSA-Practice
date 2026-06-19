/*
WAP: Rotate Matrix AntiClockWise BF
Time Complexity: O(n*2)
Space Complexity: O(n*2)
Date: 19-June-2026
*/
public class RotateMatrixAnticlockwiseBF {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix before: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        int[][] c = rotateMatrixACWBF(arr);

        System.out.println("\nMatrix After: ");
        for(int[] a : c){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrixACWBF(int[][] arr){
        int n = arr.length;
        int[][] c = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                c[n-1-j][i] = arr[i][j];
            }
        }
        return c;
    }
}

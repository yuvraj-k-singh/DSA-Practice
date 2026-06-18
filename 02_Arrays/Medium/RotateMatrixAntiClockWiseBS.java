/*
WAP: Rotate Matrix AntiClockWise BS
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 19-june-2026
*/

public class RotateMatrixAntiClockWiseBS {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix before: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        rotateMatrixACWBS(arr);

        System.out.println("\nMatrix After: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrixACWBS(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse column
        for(int j=0; j<arr[0].length; j++){
            for(int i=0, k=arr.length-1; i<k; i++, k--){
                int temp = arr[i][j];
                arr[i][j] = arr[k][j];
                arr[k][j] = temp;
            }
        }
    }
}

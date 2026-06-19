/*
WAP: Spiral Matrix Print
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 19-june-2026
*/

import java.util.ArrayList;

public class SpiralMatrixPrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix before: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        ArrayList<Integer> ans = spiralMatrix(arr);

        System.out.println("\nMatrix After: "+ans);
    }

    public static ArrayList<Integer> spiralMatrix(int[][] arr){
        int m = arr.length, n = arr[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        int fRow = 0, fCol = 0, lRow = m-1, lCol = n-1;
        int totalElem = m*n;

        while(fRow <= lRow && fCol <= lCol){
            //right
            for(int j=fCol; j<=lCol; j++){
                ans.add(arr[fRow][j]);
            }
            fRow++;
            if(ans.size() == totalElem) break;

            //down
            for(int i=fRow; i<=lRow; i++){
                ans.add(arr[i][lCol]);
            }
            lCol--;
            if(ans.size() == totalElem) break;

            //left
            for(int j=lCol; j>=fCol; j--){
                ans.add(arr[lRow][j]);
            }
            lRow--;
            if(ans.size() == totalElem) break;

            //up
            for(int i=lRow; i>=fRow; i--){
                ans.add(arr[i][fCol]);
            }
            fCol++;
            if(ans.size() == totalElem) break;
        }
        return ans;
    }
}

/*
WAP: Matrix Multiply GFG
Time Complexity: O(n*3)
Space Complexity: O(n*2)
Date: 19-June-2026
*/

import java.util.ArrayList;

public class MatrixMultiplyGFG {
    public static void main(String[] args) {
        int[][] a = {{7,8},{2,9}};
        int[][] b = {{14,5},{5,18}};

        ArrayList<ArrayList<Integer>> c = matrixMultiplyGFG(a, b);

        System.out.println("Matrices answer: ");
        for(ArrayList<Integer> arr : c){
            for(int x : arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static  ArrayList<ArrayList<Integer>> matrixMultiplyGFG(int[][] a, int[][] b){
        int n = a.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            ans.add(new ArrayList<>());
            for(int j=0; j<n; j++){
                int sum = 0;
                for(int k=0; k<n; k++){
                    sum += a[i][k]*b[k][j];
                }
                ans.get(i).add(sum);
            }
        }
        return ans;
    }
}

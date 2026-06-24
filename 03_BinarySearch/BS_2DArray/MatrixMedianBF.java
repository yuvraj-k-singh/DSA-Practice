/*
WAP: Matrix Median BF
Time Complexity: O(m*n + m*n(log(m*n))
Space Complexity: O(m*n)
Date: 22-june-2026
*/

import java.util.ArrayList;
import java.util.Collections;

public class MatrixMedianBF {
    public static void main(String[] args){
        int[][] arr = {{1, 3, 5},{2, 6, 9},{3, 6, 9}};

        int ans = matrixMedian(arr);

        System.out.println("Matrix median is: "+ans);
    }

    public static int matrixMedian(int[][] arr){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int[] a: arr){
            for(int x: a) ans.add(x);
        }
        Collections.sort(ans);
        int n = ans.size();
        return ans.get(n/2);
    }
}

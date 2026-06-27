/*
WAP: Nth Row Pascal Triangle
Time Complexity: O(N)
Space Complexity: O(N)
Date: 27-june-2026
*/

import java.util.ArrayList;

public class NthRowPascalTriangle {
    public static void main(String[] args) {
        int rowIndx = 4;

        ArrayList<Integer> ans = getRow(rowIndx);

        for(int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static ArrayList<Integer> getRow(int row){
        ArrayList<Integer> ans = new ArrayList<>();

        int n = row + 1;
        long x = 1;
        ans.add((int)x);

        for(int j=1; j<n; j++){
            x = x*(n-j)/j;
            ans.add((int)x);
        }
        return ans;
    }
}

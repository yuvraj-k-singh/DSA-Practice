/*
WAP: Pascal Triangle BS
Time Complexity: O(N^2)
Space Complexity: O(N^2)
Date: 27-june-2026
*/

import java.util.ArrayList;

public class PascalTriangleBS {
    public static void main(String[] args) {
        int rowIndx = 5;

        ArrayList<ArrayList<Integer>> ans = generateBS(rowIndx);

        for(ArrayList<Integer> a : ans){
            for(int x : a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generateBS(int row) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            int x = 1;
            ArrayList<Integer> r = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) r.add(1);
                else r.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }
            ans.add(r);
        }
        return ans;
    }
}


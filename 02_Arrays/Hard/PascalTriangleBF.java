/*
WAP: Pascal Triangle BF
Time Complexity: O(N^2)
Space Complexity: O(N^2)
Date: 27-june-2026
*/

import java.util.ArrayList;

public class PascalTriangleBF {
    public static void main(String[] args) {
        int rowIndx = 5;

        ArrayList<ArrayList<Integer>> ans = generateBF(rowIndx);

        for(ArrayList<Integer> a : ans){
            for(int x : a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> generateBF(int row){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=row; i++){
            int x = 1;
            ArrayList<Integer> r = new ArrayList<>();
            for(int j=1; j<=i; j++){
                r.add(x);
                x = x*(i-j)/j;
            }
            ans.add(r);
        }
        return ans;
    }
}

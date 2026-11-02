/*
WAP: Generate All Binary GFG
Time Complexity: O(2^n)
Space Complexity: O(n)
Date: 02-nov-2026
*/


import java.util.ArrayList;

public class GenerateAllBinaryGFG {
    public static void main(String[] args){
        int n = 2;
        ArrayList<String> ans = binaryString(n);
        System.out.println("Answer: "+ans);
    }

    public static ArrayList<String> binaryString(int n){
        ArrayList<String> list = new ArrayList<>();
        pSet(0, n, "", list);
        return list;
    }

    public static void pSet(int i, int n, String ans, ArrayList<String> list){
        if(i >= n){
            list.add(ans);
            return;
        }
        pSet(i+1, n, ans+0, list);
        pSet(i+1, n, ans+1, list);
    }
}

/*
WAP: Generate All Binary LC
Time Complexity: O(2^n)
Space Complexity: O(n)
Date: 02-nov-2026
*/

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryLC {
    public static void main(String[] args){
        int n = 3;
        List<String> ans = validStrings(n);
        System.out.println("Answer: "+ans);
    }

    public static List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        pSet(0, n, "", list);
        return list;
    }

    public static void pSet(int i, int n, String ans, List<String> list){
        if(i >= n){
            if(!ans.contains("00")){
                list.add(ans);
            }
            return;
        }

        pSet(i+1, n, ans+0, list);
        pSet(i+1, n, ans+1, list);
    }
}

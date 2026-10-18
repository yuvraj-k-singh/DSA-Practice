/*
WAP: All Subsequences BF
Time Complexity: O(N*2^n)
Space Complexity: O(N)
Date: 17-oct-2026
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllSubsequencesBF {
    public static void main(String[] args){
        String s = "abc";
        List<String> ans = subsequence(s);
        System.out.println("PowerSet: "+ans);
    }

    private static List<String> subsequence(String s) {
        List<String> list = new ArrayList<>();
        powerSet(0, s, "", list);
        Collections.sort(list);
        return list;
    }

    private static void powerSet(int i, String s, String ans, List<String> list){
        if(i >= s.length()){
            list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        powerSet(i+1, s, ans+ch, list);  //pick
        powerSet(i+1, s, ans, list); //skip
    }
}

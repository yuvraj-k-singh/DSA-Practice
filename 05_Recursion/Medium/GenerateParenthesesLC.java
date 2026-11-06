/*
WAP: Generate Parentheses LC
Time Complexity: O(2^n)
Space Complexity: O(n)
Date: 06-nov-2026
*/

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesLC {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = parentheses(n);
        System.out.println("Answer: "+ans);
    }

    public static List<String> parentheses(int n){
        List<String> list = new ArrayList<>();
        generate(n,0,0,"", list);
        return list;
    }

    private static void generate(int n, int l, int r, String ans, List<String> list){
        if(r == n){
            list.add(ans);
            return;
        }
        if(l<n) generate(n, l+1, r, ans+"(", list);
        if(r<l) generate(n, l, r+1, ans+")", list);
    }
}

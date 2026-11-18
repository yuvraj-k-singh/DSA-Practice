/*
WAP: Permutation String
Time Complexity: O(N! x N)
Space Complexity: O(N x N)
Date: 18-nov-2026
*/

import java.util.ArrayList;
import java.util.Collections;

public class PermutationString {
    public static void main(String[] args) {
        String s = "ABC";

        ArrayList<String> ans = permutation(s);
        System.out.println("Answer: ");
        for (String x : ans) System.out.print(x + " ");
    }

    private static ArrayList<String> permutation(String s){
        ArrayList<String> list = new ArrayList<>();
        generate(0, new StringBuilder(s), list);
        Collections.sort(list);
        return list;
    }

    private static void generate(int start, StringBuilder ans, ArrayList<String> list){
        if(start >= ans.length()){
            list.add(ans.toString());
            return;
        }

        for(int i=start; i<ans.length(); i++){
            char ch = ans.charAt(start);
            ans.setCharAt(start, ans.charAt(i));
            ans.setCharAt(i, ch);
            generate(start+1, ans, list);
            ch = ans.charAt(start);
            ans.setCharAt(start, ans.charAt(i));
            ans.setCharAt(i, ch);
        }
    }
}

/*
WAP: Isomorphic Strings Best
Time Complexity: O(N+K)
Space Complexity: O(2N)
Date: 08-sep-2026
*/

import java.util.HashMap;

public class IsomorphicStringBest {
    public static void main(String[] args){
        String s = "egg", t = "add";

        boolean ans = isIsomorphicBest(s, t);

        if(ans) System.out.println("The given two strings are isomorphic");
        else System.out.println("The given two strings are not isomorphic");
    }

    public static boolean isIsomorphicBest(String s, String t) {
        if (s.length() != t.length()) return false;
        int n = s.length();

        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(!m1.containsKey(ch1)){
                m1.put(ch1, ch2);
            }
            if(!m2.containsKey(ch2)){
                m2.put(ch2, ch1);
            }
            if(m1.get(ch1) != ch2 || m2.get(ch2) != ch1){
                return false;
            }
        }
        return true;
    }
}

/*
WAP: Isomorphic Strings Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 08-sep-2026
*/

public class IsomorphicStringOptimal {
    public static void main(String[] args){
        String s = "egg", t = "add";

        boolean ans = isIsomorphicOptimal(s, t);

        if(ans) System.out.println("The given two strings are isomorphic");
        else System.out.println("The given two strings are not isomorphic");
    }

    public static boolean isIsomorphicOptimal(String s, String t) {
        if (s.length() != t.length()) return false;
        int n = s.length();

        char[] m1 = new char[256];
        char[] m2 = new char[256];

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(m1[ch1] == '\0' && m2[ch2] == '\0'){
                m1[ch1] = ch2;
                m2[ch2] = ch1;
            }else if(m1[ch1]!=ch2 && m2[ch2]!=ch1){
                return false;
            }
        }
        return true;
    }
}

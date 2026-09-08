/*
WAP: Isomorphic Strings BF
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 04-sep-2026
*/

public class IsomorphicStringsBF {
    public static void main(String[] args){
        String s = "egg", t = "add";

        boolean ans = isIsomorphic(s, t);

        if(ans) System.out.println("The given two strings are isomorphic");
        else System.out.println("The given two strings are not isomorphic");
    }

    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        int n = s.length();

        for(int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            for(int j=0; j<n; j++){
                if(s.charAt(j) == ch1 && t.charAt(j) != ch2){
                    return false;
                }
                if(t.charAt(j) == ch2 && s.charAt(j) != ch1){
                    return false;
                }
            }
        }
        return true;
    }
}

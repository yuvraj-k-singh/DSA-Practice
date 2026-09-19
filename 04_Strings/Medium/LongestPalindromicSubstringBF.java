/*
WAP: Longest Palindromic Substring BF
Time Complexity: O(N^3)
Space Complexity: O(N)
Date: 19-sep-2026
*/

public class LongestPalindromicSubstringBF {
    public static void main(String[] args){
        String s = "abrbadaadab";

        String ans = longestPalindromeBF(s);
        System.out.println("Longest palindromic substring is: "+ans);
    }

    public static String longestPalindromeBF(String s){
        int max = 0;
        String ans = "";

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String temp = s.substring(i, j+1);
                if(palindrome(temp)){
                    if(max < temp.length()){
                        max = temp.length();
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }

    private static boolean palindrome(String s){
        int i = 0, j = s.length()-1;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

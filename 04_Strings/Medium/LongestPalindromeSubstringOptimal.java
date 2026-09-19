/*
WAP: Longest Palindromic Substring Optimal
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 19-sep-2026
*/

public class LongestPalindromeSubstringOptimal {
    public static void main(String[] args){
        String s = "abrbadaadab";

        String ans = longestPalindrome(s);
        System.out.println("Longest palindromic substring is: "+ans);
    }

    public static String longestPalindrome(String s){
        int start = 0, end = 0;

        for(int i=0; i<s.length(); i++){
            int odd = isPalindrome(s, i, i);
            int even = isPalindrome(s, i, i+1);
            int len = Math.max(odd, even);

            if(len > (end-start-1)){
                start = i - (len-1)/2;
                end = i + (len/2);
            }
        }
        return s.substring(start, end+1);
    }

    public static int isPalindrome(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}

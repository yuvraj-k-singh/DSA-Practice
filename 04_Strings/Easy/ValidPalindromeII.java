/*
WAP: Valid Palindrome II
Time Complexity: O(N)
Space Complexity: O(1)
Date: 21-oct-2026
*/

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abca";
        boolean ans = validPalindrome(s);

        if(ans) System.out.println("Given String "+s+" is Palindrome!");
        else System.out.println("Given String "+s+" is not Palindrome!");
    }

    public static boolean validPalindrome(String s){
        int i = 0, j = s.length()-1;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalidrome(s, i+1, j) || isPalidrome(s, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalidrome(String s, int i, int j) {
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

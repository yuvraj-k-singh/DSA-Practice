/*
WAP: Valid Palindrome Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 25-sep-2026
*/

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "";
        boolean ans = validPalindrome(s);

        if(ans) System.out.println("The given String is palindrome!");
        else System.out.println("The given String is not palindrome!");
    }

    public static boolean validPalindrome(String s){
        int i = 0, j = s.length()-1;

        while(i<=j){
            while(i<=j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }

            while(i<=j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

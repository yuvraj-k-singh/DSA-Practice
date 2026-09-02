/*
WAP: GFG Check Valid Palindrome
Time Complexity: O(N)
Space Complexity: O(1)
Date: 02-sep-2026
*/

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "namaN";

        boolean flag = validPalindrome(str);

        if(flag) System.out.println("Given string "+str+" is valid Palindrome!");
        else System.out.println("Given string "+str+" is not valid Palindrome");
    }

    public static boolean validPalindrome(String s){
        int i = 0, j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

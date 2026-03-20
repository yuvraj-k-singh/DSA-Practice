/*
WAP: Palindrome Number
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 20-mar-2026
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;

        boolean flag = isPalindrome(num);

        if(flag) System.out.println("Given number "+num+" is Palindrome Number");
        else System.out.println("Given number "+num+" is not Palindrome Number");
    }
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }

        if(temp < 0) return false;
        return (temp==rev) ? true : false;
    }
}

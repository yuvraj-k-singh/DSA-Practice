/*
WAP: Reverse Integer
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 20-mar-2026
*/

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123;

        System.out.print("The reverse of integer: "+reverse(num));
    }
    public static int reverse(int n) {
        long rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)rev;
        }
    }
}

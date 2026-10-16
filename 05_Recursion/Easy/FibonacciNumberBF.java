/*
WAP: Fibonacci Number BF
Time Complexity: O(2^n)
Space Complexity: O(N)
Date: 14-oct-2026
*/

public class FibonacciNumberBF {
    public static void main(String[] args){
        int n = 2;
        int ans = fibo(n);
        System.out.println("Fibonacci Number of "+n+" is: "+ans);
    }

    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

/*
WAP: Fibonacci Number Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 16-oct-2026
*/

public class FibonacciNumberOptimal {
    public static void main(String[] args){
        int n = 3;
        int ans = fibo(n);
        System.out.println("Fibonacci Number of "+n+" is: "+ans);
    }

    public static int fibo(int n){
        if(n < 1){
            return 0;
        }

        int a = 0, b = 1;
        for(int i=2; i<=n; i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return b;
    }
}

/*
WAP: GCD Optimal
Time Complexity: O(Log(min(a,b))
Space Complexity: O(1)
Date: 16-oct-2026
*/

public class GCDOptimal {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int ans = gcd(a,b);
        System.out.println("GCD: "+ans);
    }

    private static int gcd(int a, int b){
        while(b != 0){
            int rem = b % a;
            a = b;
            b = rem;
        }
        return a;
    }
}

/*
WAP: GCD BF
Time Complexity: O(Log(min(a,b))
Space Complexity: O(N)
Date: 14-oct-2026
*/

public class GCDBF {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int ans = gcd(a,b);
        System.out.println("GCD: "+ans);
    }

    private static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}

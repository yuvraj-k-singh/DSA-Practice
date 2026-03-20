/*
WAP: Perfect Number
Time Complexity: O(root N)
Space Complexity: O(1)
Date: 20-mar-2026
*/

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;

        boolean flag = isPerfect(num);

        if(flag) System.out.println("Given number "+num+" is Perfect Number");
        else System.out.println("Given number "+num+" is not Perfect Number");
    }

    public static boolean isPerfect(int n) {
        int sum = 0;

        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                sum += i;
                if(i!=n/i){
                    sum+=n/i;
                }
            }
        }
        sum = sum - n;
        return (sum == n) ? true : false;
    }
}

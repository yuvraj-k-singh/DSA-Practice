/*
WAP: Sum Of Square Number
Time Complexity: O(Sqrt(n))
Space Complexity: O(1)
Date: 26-june-2026
*/

public class SumOfSquareNumber {
    public static void main(String[] args) {
        int num = 5;

        boolean ans = sumOfSquare(num);

        System.out.println("Num: "+num+" --> "+ans);
    }

    public static boolean sumOfSquare(int n){
        int low = 0, high = (int)(Math.sqrt(n));

        while(low<=high){
            int check = ((low*low)+(high*high));

            if(check==n) return true;
            else if(check > n) high--;
            else low++;
        }
        return false;
    }
}

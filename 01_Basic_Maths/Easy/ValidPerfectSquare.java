/*
WAP: Valid Perfect Square
Time Complexity: O(Sqrt(n)
Space Complexity: O(1)
Date: 26-june-2026
*/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 19;

        boolean ans = perfectSquare(num);

        System.out.println("Num: "+num+" --> "+ans);
    }

    public static boolean perfectSquare(int num){
        for(int i=1; i<=Math.sqrt(num); i++){
            if(i*i == num) return true;
        }
        return false;
    }
}

/*
WAP: Count Digits Divides Number
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 22-mar-2026
*/

public class CountDigitsDividesNumber {
    public static void main(String[] args){
        int num = 121;

        int ans = countDigits(num);

        System.out.print("The total digits divides "+num+" is: "+ans);
    }

    private static int countDigits(int num) {
        int temp = num;
        int count = 0;

        while(num!=0){
            int digit = num%10;
            if(temp % digit == 0) count++;
            num/=10;
        }

        return count;
    }
}

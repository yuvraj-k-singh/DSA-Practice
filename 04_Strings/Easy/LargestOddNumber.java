/*
WAP: Largest Odd Number Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 07-sep-2026
*/

public class LargestOddNumber {
    public static void main(String[] args){
        String s = "457651";

        String ans = largestOddNumber(s);
        System.out.println("The largest odd number in a string: "+ans);
    }

    public static String largestOddNumber(String s){
        for(int i=s.length()-1; i>=0; i--){
            int temp = s.charAt(i) - '0';
            if(temp % 2 != 0){
                return s.substring(0, i+1);
            }
        }
        return new String("");
    }
}

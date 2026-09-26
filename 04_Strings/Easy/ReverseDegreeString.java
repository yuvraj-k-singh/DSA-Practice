/*
WAP: Reverse Degree String Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 26-sep-2026
*/

public class ReverseDegreeString {
    public static void main(String[] args){
        String s = "zaza";
        int ans = reverseDegree(s);
        System.out.println("Reverse degree: "+ans);
    }

    public static int reverseDegree(String s) {
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            int x = 26 - (s.charAt(i)-'a');
            sum += x*(i+1);
        }
        return sum;
    }
}

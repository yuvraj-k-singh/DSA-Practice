/*
WAP: Rotate String Optimal
Time Complexity: O(N)
Space Complexity: O(2N)
Date: 09-sep-2026
*/

public class RotateStringOptimal {
    public static void main(String[] args) {
        String s1 = "abcde", s2 = "deabc";

        boolean ans = checkRotateStringOptimal(s1,s2);

        if(ans) System.out.println("The given string "+s2+" is rotated version of "+s1);
        else System.out.println("The given string "+s2+" is not rotated version of "+s1);
    }

    public static boolean checkRotateStringOptimal(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        String temp = s1+s1;
        return temp.contains(s2);
    }
}

/*
WAP: Rotate String BF
Time Complexity: O(N^2)
Space Complexity: O(N)
Date: 09-sep-2026
*/

public class RotateStringBF {
    public static void main(String[] args) {
        String s1 = "abcde", s2 = "deabc";

        boolean ans = checkRotateString(s1,s2);

        if(ans) System.out.println("The given string "+s2+" is rotated version of "+s1);
        else System.out.println("The given string "+s2+" is not rotated version of "+s1);
    }

    public static boolean checkRotateString(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        for(int i=0; i<s1.length(); i++){
            String temp = s1.substring(i) + s1.substring(0,i);
            if(temp.equals(s2)){
                return true;
            }
        }
        return false;
    }
}

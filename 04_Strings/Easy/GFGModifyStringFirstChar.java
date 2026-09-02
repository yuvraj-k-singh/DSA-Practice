/*
WAP: GFG Modify String Based On First Character
Time Complexity: O(1)
Space Complexity: O(1)
Date: 02-sep-2026
*/

public class GFGModifyStringFirstChar {
    public static void main(String[] args) {
        String str = "PaBhdD";

        String s = modifyString(str);
        System.out.println("Modified String: "+s);
    }

    public static String modifyString(String s){
        char ch = s.charAt(0);

        return ((int)ch>=65 && (int)ch<=90) ? s.toUpperCase() : s.toLowerCase();
    }
}

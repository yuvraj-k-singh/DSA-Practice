/*
WAP: Check Anagram String
Time Complexity: O(N)
Space Complexity: O(1)
Date: 04-sep-2026
*/

public class CheckAnagramBS {
    public static void main(String[] args) {
        String s1 = "anagram", s2 = "nagaram";

        boolean flag = checkAnagram(s1, s2);

        if(flag) System.out.println("Both given Strings are Anagram");
        else System.out.println("Both given Strings are not Anagram");
    }

    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] count = new int[26];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int x: count){
            if(x != 0) return false;
        }
        return true;
    }
}

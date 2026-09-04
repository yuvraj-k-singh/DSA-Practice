/*
WAP: Check Anagram String BF
Time Complexity: O(NlogN)
Space Complexity: O(N)
Date: 04-sep-2026
*/

import java.util.Arrays;

public class CheckAnagramBF {
    public static void main(String[] args) {
        String s1 = "anagram", s2 = "nagaram";

        boolean flag = checkAnagram(s1, s2);

        if(flag) System.out.println("Both given Strings are Anagram");
        else System.out.println("Both given Strings are not Anagram");
    }

    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0; i<s1.length(); i++){
            if(ch1[i] != ch2[i]) return false;
        }
        return true;
    }
}

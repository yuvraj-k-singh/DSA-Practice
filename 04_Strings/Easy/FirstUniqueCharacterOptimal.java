/*
WAP: First Unique Character Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 04-sep-2026
*/

public class FirstUniqueCharacterOptimal {
    public static void main(String[] args) {
        String str = "leetcode";

        int index = firstUniqueCharOptimal(str);

        System.out.println("The first index of unique character is: "+index);
    }

    public static int firstUniqueCharOptimal(String s){
        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

/*
WAP: First Letter Twice Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 26-sep-2026
*/

public class FirstLetterTwiceOptimal {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char ans = firstLetter(s);
        System.out.println("Answer: "+ans);
    }

    public static char firstLetter(String s){
        boolean[] ans = new boolean[26];

        for(char ch: s.toCharArray()){
            if(ans[ch-'a'] == true){
                return ch;
            }
            ans[ch-'a'] = true;
        }
        return '\0';
    }
}

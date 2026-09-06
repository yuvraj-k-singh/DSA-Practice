/*
WAP: Max Words In Sentence Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 06-sep-2026
*/

public class MaxWordsInSentence {
    public static void main(String[] args){
        String[] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int ans = maxWords(str);

        System.out.println("The maximum words in Sentence is: "+ans);
    }

    public static int maxWords(String[] str){
        int max = Integer.MIN_VALUE;

        for(String s: str){
            int words = countWords(s);
            max = Math.max(max, words);
        }
        return max;
    }

    private static int countWords(String s){
        int count = 1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') count++;
        }
        return count;
    }
}

/*
WAP: Total Words in String GFG
Time Complexity: O(N)
Space Complexity: O(1)
Date: 06-sep-2026
*/

public class CountWordsGFG {
    public static void main() {
        String s = "Yuvraj\tSingh\nKumar";

        int ans = countWords(s);
        System.out.println("Total words in string: "+ans);
    }

    public static int countWords(String s) {
        int words = 0;
        boolean wordFlag = false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == ' ' || ch == '\t' || ch == '\n'){
                wordFlag = false;
            }else if(!wordFlag){
                words++;
                wordFlag = true;
            }
        }
        return words;
    }

}

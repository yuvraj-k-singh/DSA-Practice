/*
WAP: Length Of Last Word Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 04-sep-2026
*/

public class LengthOfLastWord {
    public static void main(String[] args){
        String str = "   fly me   to   the moon  ";

        int length = lengthLastWord(str);

        System.out.println("The length of last word is: "+length);
    }

    private static int lengthLastWord(String s){
        s = s.trim();
        int i = s.length()-1, count = 0;

        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}

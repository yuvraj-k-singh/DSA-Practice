/*
WAP: Reverse Vowels Optimal
Time Complexity: O(N)
Space Complexity: O(N)
Date: 04-sep-2026
*/

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "IceCreAm";

        String ans = reverseVowels(str);

        System.out.println("The reversed Vowel String: "+ans);
    }

    public static String reverseVowels(String s){
        StringBuilder sb = new StringBuilder(s);
        int i=0, j=sb.length()-1;

        while(i<j){
            while(i<j && !isVowel(sb.charAt(i))){
                i++;
            }
            while(i<j && !isVowel(s.charAt(j))){
                j--;
            }
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            sb.setCharAt(i, ch2);
            sb.setCharAt(j, ch1);
            i++;
            j--;
        }
        return sb.toString();
    }

    private static Boolean isVowel(char ch){
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}

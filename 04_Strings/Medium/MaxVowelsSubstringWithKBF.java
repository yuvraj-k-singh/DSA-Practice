/*
WAP: Max Vowels Substring With K BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 30-oct-2026
*/

public class MaxVowelsSubstringWithKBF {
    public static void main() {
        String s = "aeiou";
        int k = 2;

        int ans = maxVowel(s, k);
        System.out.println("Max numbers of vowels in substring of length "+k+" is: "+ans);
    }

    public static int maxVowel(String s, int k){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<s.length(); i++){
            int cnt = 0;
            for(int j=i; j<s.length(); j++){
                if(isVowel(s.charAt(i))){
                    cnt++;
                }
                if(j-i+1 == k){
                    max = Math.max(max, cnt);
                }
            }
        }
        return max;
    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

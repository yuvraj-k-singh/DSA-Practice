/*
WAP: Max Vowels Substring With K Optimal
Time Complexity: O(n)
Space Complexity: O(1)
Date: 30-oct-2026
*/

public class MaxVowelSubstringWithKOptimal {
    public static void main() {
        String s = "aeiou";
        int k = 3;

        int ans = maxVowel(s, k);
        System.out.println("Max numbers of vowels in substring of length "+k+" is: "+ans);
    }

    public static int maxVowel(String s, int k){
        int max = Integer.MIN_VALUE;
        int cnt = 0, left = 0;

        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))) {
                cnt++;
            }
            if(i-left+1 >= k){
                max = Math.max(max, cnt);
                if(isVowel(s.charAt(left))) {
                    cnt--;
                }
            }
        }
        return max;
    }

    private static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

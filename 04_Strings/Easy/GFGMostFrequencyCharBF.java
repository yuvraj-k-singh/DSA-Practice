/*
WAP: GFG Most Frequency Char BF
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 04-sep-2026
*/

public class GFGMostFrequencyCharBF {
    public static void main(String[] args){
        String str = "testsample";

        char ans = mostFrequencyBF(str);

        System.out.println("The most frequent character is: "+ans);
    }

    public static char mostFrequencyBF(String s){
        int max = -1;
        char ans = s.charAt(0);

        for(int i=0; i<s.length(); i++){
            int cnt = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
            }
            if(max < cnt){
                max = cnt;
                ans = s.charAt(i);
            }else if(max == cnt && ans > s.charAt(i)){
                ans = s.charAt(i);
            }
        }
        return ans;
    }
}

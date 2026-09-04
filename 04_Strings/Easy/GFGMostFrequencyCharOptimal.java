/*
WAP: GFG Most Frequency Char Optimal soln
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 04-sep-2026
*/

public class GFGMostFrequencyCharOptimal {
    public static void main(String[] args){
        String str = "testsample";

        char ans = mostFrequencyOptimal(str);

        System.out.println("The most frequent character is: "+ans);
    }

    public static char mostFrequencyOptimal(String s){
        int[] count = new int[26];
        int max = -1;
        char ans = s.charAt(0);

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<count.length; i++){
            if(max < count[i]){
                max = count[i];
                ans = (char)(i+'a');
            }
        }
        return ans;
    }
}

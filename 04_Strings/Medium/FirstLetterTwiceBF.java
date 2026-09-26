/*
WAP: First Letter Twice BF
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 26-sep-2026
*/

public class FirstLetterTwiceBF {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char ans = firstLetterBF(s);
        System.out.println("Answer: "+ans);
    }

    public static char firstLetterBF(String s){
        int min = Integer.MAX_VALUE;
        char ans = '\0';

        for(int i=0; i<s.length(); i++){
            int indx = -1;
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    indx = j;
                    break;
                }
            }
            if(indx!=-1 && indx < min){
                min = indx;
                ans = s.charAt(i);
            }
        }
        return ans;
    }
}

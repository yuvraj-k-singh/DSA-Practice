/*
WAP: Make String Great Optimal
Time Complexity: O(N)
Space Complexity: O(N)
Date: 27-sep-2026
*/

public class MakeStringGreat {
    public static void main(String[] args){
        String s = "leEeetcode";
        String ans = makeStringGreat(s);
        System.out.println("Answer: "+ans);
    }

    public static String makeStringGreat(String s){
        StringBuilder ans = new StringBuilder();

        for(char ch: s.toCharArray()){
            int len = ans.length();
            if(len>0 && Math.abs(ch - ans.charAt(len-1)) == 32){
                ans.deleteCharAt(len-1);
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

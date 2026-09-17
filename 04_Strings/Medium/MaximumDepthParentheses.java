/*
WAP: Maximum Depth Parentheses Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 17-sep-2026
*/

public class MaximumDepthParentheses {
    public static void main(String[] args){
        String s = "((())(((1))))";

        int ans = maximumDepthParenthese(s);

        if(ans == 0) System.out.println("There is no maximum depth parentheses available!");
        else System.out.println("The maximum depth parentheses is: "+ans);
    }

    public static int maximumDepthParenthese(String s){
        int cnt = 0, max = 0;

        for(char ch: s.toCharArray()){
            if(ch == '('){
                cnt++;
                max = Math.max(max, cnt);
            }else if(ch == ')'){
                cnt--;
            }
        }
        return max;
    }
}

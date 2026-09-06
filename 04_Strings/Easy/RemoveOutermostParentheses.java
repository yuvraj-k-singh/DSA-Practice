/*
WAP: Remove Outermost Parentheses
Time Complexity: O(N)
Space Complexity: O(1)
Date: 06-sep-2026
*/

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";

        String ans = removeParentheses(s);

        System.out.println("Answer is: "+ans);
    }

    public static String removeParentheses(String s){
        StringBuilder ans = new StringBuilder();
        int counter = 0;

        for(char ch: s.toCharArray()){
            if(ch == '('){
                if(counter > 0){
                    ans.append(ch);
                }
                counter++;
            }else if(ch == ')'){
                counter--;
                if(counter > 0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}

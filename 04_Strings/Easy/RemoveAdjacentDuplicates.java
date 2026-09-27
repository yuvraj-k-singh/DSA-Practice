/*
WAP: Remove Adjacent Duplicates Optimal
Time Complexity: O(N)
Space Complexity: O(N)
Date: 27-sep-2026
*/

public class RemoveAdjacentDuplicates {
    public static void main(String[] args){
        String s = "abbaca";

        String ans = removeDuplicateAdjacent(s);
        System.out.println("Answer: "+ans);
    }

    public static String removeDuplicateAdjacent(String s){
        StringBuilder ans = new StringBuilder();

        for(char ch: s.toCharArray()){
            int len = ans.length();
            if(len>0 && ch == ans.charAt(len-1)){
                ans.deleteCharAt(len-1);
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

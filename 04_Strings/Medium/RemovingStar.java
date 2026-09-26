/*
WAP: Removing Star Optimal
Time Complexity: O(N)
Space Complexity: O(N)
Date: 25-sep-2026
*/
public class RemovingStar {
    public static void main(String[] args){
        String s = "erase****";

        String ans = removeStar(s);
        System.out.println("String after removing *: "+ans);
    }

    public static String removeStar(String s){
        StringBuilder ans = new StringBuilder();

        for(char ch: s.toCharArray()){
            if(ch == '*'){
                ans.deleteCharAt(ans.length()-1);
                continue;
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

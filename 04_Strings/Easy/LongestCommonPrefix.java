/*
WAP: Longest Common Prefix Optimal
Time Complexity: O(NxM(common char))
Space Complexity: O(M)
Date: 07-sep-2026
*/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "fly"};

        String ans = longestCommonPrefix(str);
        System.out.println("The longest common prefix is: "+ans);
    }

    public static String longestCommonPrefix(String[] str){
        String ans = str[0];

        for(int i=1; i<str.length; i++){
            ans = commonPrefix(ans, str[i]);
        }
        return ans;
    }

    private static String commonPrefix(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());

        for(int i=0; i<n; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else break;
        }
        return sb.toString();
    }
}

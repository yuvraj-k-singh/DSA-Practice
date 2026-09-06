/*
WAP: Reverse Words Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 06-sep-2026
*/

public class ReverseWordOptimal {
    public static void main(String[] args) {
        String s = "   hello world  ";

        String ans = reverseWordBS(s);

        System.out.println("Reversed Word: "+ans);
    }

    public static String reverseWordBS(String s){
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i>=0){
            while(i>=0 && s.charAt(i) == ' '){
                i--;
            }

            if(i<0) break;
            int j = i;

            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }

            //word
            if(ans.isEmpty()){
                ans.append(s.substring(i+1, j+1));
            }else{
                ans.append(" ");
                ans.append(s.substring(i+1, j+1));
            }
        }
        return ans.toString();
    }
}

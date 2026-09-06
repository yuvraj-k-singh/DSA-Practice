/*
WAP: Reverse Words BF
Time Complexity: O(N)
Space Complexity: O(N)
Date: 06-sep-2026
*/

public class ReverseWordsBF {
    public static void main(String[] args) {
        String s = "   hello world  ";

        String ans = reverseWordBF(s);

        System.out.println("Reversed Word: "+ans);
    }

    public static String reverseWordBF(String s){
        String[] str = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for(int i=str.length-1; i>=0; i--){
            if(str[i].isEmpty()) continue;

            if(ans.isEmpty()){
                ans.append(str[i]);
            }else{
                ans.append(" ");
                ans.append(str[i]);
            }
        }
        return ans.toString();
    }
}

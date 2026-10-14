/*
WAP: Count Segments Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 14-oct-2026
*/

public class CountSegments {
    public static void main(String[] args) {
        String s = "love live! mu'sic forever";
        int ans = countSegments(s);
        System.out.println("Numbers of segments are: "+ans);
    }

    public static int countSegments(String s) {
        int count = 0;
        boolean flag = false;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                flag = false;
            }else if(!flag){
                count++;
                flag = true;
            }
        }
        return count;
    }
}

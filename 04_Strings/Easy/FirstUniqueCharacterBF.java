/*
WAP: First Unique Character BF
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 04-sep-2026
*/

public class FirstUniqueCharacterBF {
    public static void main(String[] args) {
        String str = "leetcode";

        int index = firstUniqueCharBF(str);

        System.out.println("The first index of unique character is: "+index);
    }

    public static int firstUniqueCharBF(String s){
        for(int i=0; i<s.length(); i++){
            int cnt = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
            }
            if(cnt == 1) return i;
        }
        return -1;
    }
}

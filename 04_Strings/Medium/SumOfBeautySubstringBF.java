/*
WAP: Sum Of Beauty Substring BF
Time Complexity: O(N^3)
Space Complexity: O(N)
Date: 19-sep-2026
*/

import java.util.HashMap;

public class SumOfBeautySubstringBF {
    public static void main(String[] args){
        String s = "aabcb";

        int sum  = sumOfBeautyBF(s);
        System.out.println("Sum: "+sum);
    }

    public static int sumOfBeautyBF(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i; j<s.length(); j++){
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch,0)+1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int x: map.values()){
                    max = Math.max(max, x);
                    min = Math.min(min, x);
                }
                sum += (max - min);
            }
        }
        return sum;
    }
}

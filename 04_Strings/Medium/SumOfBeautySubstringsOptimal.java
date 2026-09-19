/*
WAP: Sum Of Beauty Substring Optimal
Time Complexity: O(N^2)
Space Complexity: O(1)
Date: 19-sep-2026
*/

public class SumOfBeautySubstringsOptimal {
    public static void main(String[] args){
        String s = "aabcb";

        int sum  = sumOfBeauty(s);
        System.out.println("Sum: "+sum);
    }

    public static int sumOfBeauty(String s) {
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            int[] freq = new int[26];
            for(int j=i; j<s.length(); j++){
                freq[s.charAt(j) - 'a']++;
                int beauty = max(freq) - min(freq);
                sum += beauty;
            }
        }
        return sum;
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int x: arr){
            max = Math.max(x, max);
        }
        return max;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int x: arr){
            if(x != 0){
                min = Math.min(min, x);
            }
        }
        return min;
    }
}

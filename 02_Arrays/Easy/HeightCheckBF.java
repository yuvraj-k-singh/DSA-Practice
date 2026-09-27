/*
WAP: Height Check Brute Force
Time Complexity: O(NlogN)
Space Complexity: O(N)
Date: 27-sep-2026
*/

import java.util.Arrays;

public class HeightCheckBF {
    public static void main(String[] args){
        int[] height = {5,1,2,3,4};

        int ans = heightCheck(height);
        System.out.println("Total Mismatched Students: "+ans);
    }

    public static int heightCheck(int[] height){
        int[] expected = Arrays.copyOf(height, height.length);
        Arrays.sort(expected);

        int cnt = 0;

        for(int i=0; i<height.length; i++){
            if(expected[i] != height[i]){
                cnt++;
            }
        }
        return cnt;
    }
}

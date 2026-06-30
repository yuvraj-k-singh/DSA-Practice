/*
WAP: Longest Subarray With Sum 0
Time Complexity: O(N)
Space Complexity: O(1)
Date: 30-june-2026
*/

import java.util.HashMap;

public class LongestSubarrayWithSum0 {
    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};

        int len = longestSubarray(nums);

        System.out.println("Longest subarray length with sum 0 is: "+len);
    }

    public static int longestSubarray(int[] nums){
        int n = nums.length;
        int sum = 0, maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum == 0) maxLen = i+1;
            if(map.containsKey(sum)) maxLen = Math.max(maxLen, i-map.get(sum));
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return maxLen;
    }
}

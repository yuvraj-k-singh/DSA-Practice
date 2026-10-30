/*
WAP: Min Size Subarray Sum Optimal
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 30-oct-2026
*/

public class MinSizeSubarraySumOptimal {
    public static void main() {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        int ans = minSize(nums, target);
        System.out.println("Answer: "+ans);
    }

    public static int minSize(int[] nums, int target){
        int len = Integer.MAX_VALUE;
        int sum = 0, left = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                len = Math.min(len, i-left+1);
                sum -= nums[left++];
            }
        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}

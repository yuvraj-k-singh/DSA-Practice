/*
WAP: Min Size Subarray Sum BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 30-oct-2026
*/


public class MinSizeSubarraySumBF {
    public static void main() {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        int ans = minSize(nums, target);
        System.out.println("Answer: "+ans);
    }

    public static int minSize(int[] nums, int target){
        int len = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum >= target){
                    len = Math.min(len, j-i+1);
                }
            }
        }
        return (len == Integer.MAX_VALUE) ? 0 : len;
    }
}

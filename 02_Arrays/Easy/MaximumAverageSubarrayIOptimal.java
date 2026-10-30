/*
WAP: Maximum Average Subarray I Optimal
Time Complexity: O(n)
Space Complexity: O(1)
Date: 22-oct-2026
*/


public class MaximumAverageSubarrayIOptimal {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        double ans = maxAvgSubarray(nums, k);
        System.out.println("Answer: "+ans);
    }

    public static double maxAvgSubarray(int[] nums, int k){
        int sum = 0, max = Integer.MIN_VALUE;
        int left = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(i-left+1 >= k){
                max = Math.max(max, sum);
                sum -= nums[left++];
            }
        }
        return (double)max/k;
    }
}

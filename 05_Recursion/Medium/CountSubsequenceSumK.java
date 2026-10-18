/*
WAP: Count Subsequence with Sum K
Time Complexity: O(2^n)
Space Complexity: O(N)
Date: 18-oct-2026
*/

public class CountSubsequenceSumK {
    public static void main(String[] args){
        int[] nums = {4,9,2,5,1};
        int k = 10;
        int ans = countSubsequence(nums, k);
        System.out.println("Total count: "+ans);
    }

    public static int countSubsequence(int[] nums, int k){
        return powerSet(0, nums, 0, k);
    }

    private static int powerSet(int i, int[] nums, int sum, int k){
        if(i >= nums.length){
            if(sum == k){
                return 1;
            }else return 0;
        }

        sum += nums[i];
        int left = powerSet(i+1, nums, sum, k);
        sum -= nums[i];
        int right = powerSet(i+1, nums, sum, k);
        return left+right;
    }
}

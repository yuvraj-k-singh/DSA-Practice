/*
WAP: Print Subsequence Sum K
Time Complexity: O(2^n)
Space Complexity: O(N)
Date: 18-oct-2026
*/

import java.util.ArrayList;

public class PrintSubsequenceSumK {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int k = 3;
        printSubsequence(nums, k);
    }

    public static void printSubsequence(int[] nums, int k){
        powerSet(0, nums, 0, k, new ArrayList<Integer>());
    }

    private static void powerSet(int i, int[] nums, int sum, int k, ArrayList<Integer> ans){
        if(i >= nums.length){
            if(sum == k){
                System.out.print(ans + " ");
            }
            return;
        }
        ans.add(nums[i]);
        sum += nums[i];
        powerSet(i+1, nums, sum, k, ans);
        ans.remove(ans.size()-1);
        sum -= nums[i];
        powerSet(i+1, nums, sum, k, ans);
    }
}

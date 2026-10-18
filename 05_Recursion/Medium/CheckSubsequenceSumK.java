/*
WAP: Check Subsequence with Sum K
Time Complexity: O(2^n)
Space Complexity: O(N)
Date: 18-oct-2026
*/

public class CheckSubsequenceSumK {
    public static void main(String[] args){
        int[] nums = {10, 1, 2, 7, 6, 1, 5};
        int k = 8;
        boolean flag = check(nums, k);

        if(flag) System.out.println("True");
        else System.out.println("False");
    }

    public static boolean check(int[] nums, int k){
        return powerSet(0, nums, 0, k);
    }

    private static boolean powerSet(int i, int[] nums, int sum, int k){
        if(i >= nums.length){
            return sum == k;
        }

        sum += nums[i];
        if(powerSet(i+1, nums, sum, k) == true){
            return true;
        }
        sum -= nums[i];
        if(powerSet(i+1, nums, sum, k) == true){
            return true;
        }
        return false;
    }
}

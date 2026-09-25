/*
WAP: Buy Two Chocolates BF
Time Complexity: O(NlogN)
Space Complexity: O(N)
Date: 25-sep-2026
*/

import java.util.Arrays;

public class BuyTwoChocolatesBF {
    public static void main(String[] args){
        int[] nums = {1,2,2};
        int money = 3;

        int ans = buyTwoChocolatesBF(nums, money);
        System.out.println("Answer: "+ans);
    }

    public static int buyTwoChocolatesBF(int[] nums, int money){
        Arrays.sort(nums);
        int amt = nums[0] + nums[1];
        return (money >= amt) ? money-amt : money;
    }
}

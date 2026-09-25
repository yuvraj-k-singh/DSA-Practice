/*
WAP: Buy Two Chocolates Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 25-sep-2026
*/

public class BuyTwoChocolatesOptimal {
    public static void main(String[] args){
        int[] nums = {1,2,2};
        int money = 3;

        int ans = buyTwoChocolates(nums, money);
        System.out.println("Answer: "+ans);
    }

    public static int buyTwoChocolates(int[] nums, int money){
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for(int x: nums){
            if(x < min1){
                min2 = min1;
                min1 = x;
            }else if(x < min2){
                min2 = x;
            }
        }

        int amt = min1 + min2;
        return (money >= amt) ? money-amt : money;
    }
}

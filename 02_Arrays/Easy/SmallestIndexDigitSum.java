/*
WAP: Smallest Index Digit Sum Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 26-sep-2026
*/

public class SmallestIndexDigitSum {
    static void main(String[] args) {
        int[] nums = {1,10,11};

        int ans = smallestIndexSum(nums);
        System.out.println(ans);
    }

    public static int smallestIndexSum(int[] nums){
        for(int i=0; i<nums.length; i++){
            int temp = nums[i], sum = 0;
            while(temp!=0){
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == i) return i;
        }
        return -1;
    }
}

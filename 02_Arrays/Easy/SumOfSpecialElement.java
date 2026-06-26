/*
WAP: Sum Of Special Element
Time Complexity: O(n)
Space Complexity: O(1)
Date: 26-june-2026
*/

public class SumOfSpecialElement {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};

        int ans = sumOfSpecialElement(nums);

        System.out.println("Sum of special Element is: "+ans);
    }

    public static int sumOfSpecialElement(int[] nums){
        int ans = nums.length;
        int sum = 0;

        for(int i=1; i<=ans; i++){
            if(ans % i == 0) sum += (nums[i-1]*nums[i-1]);
        }
        return sum;
    }
}

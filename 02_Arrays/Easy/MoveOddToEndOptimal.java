/*
WAP: Move Odd To End Optimal
Time Complexity: O(N)
Space Complexity: O(1)
Date: 14-oct-2026
*/

public class MoveOddToEndOptimal {
    public static void main(String[] args) {
        int[] nums = {3,4,1,2,0,5,7};

        int[] ans = moveOddBF(nums);
        System.out.println("Answer: ");
        for(int x: ans) System.out.print(x+" ");
    }

    public static int[] moveOddBF(int[] nums){
        int even = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                int temp = nums[even];
                nums[even] = nums[i];
                nums[i] = temp;
                even++;
            }
        }
        return nums;
    }
}

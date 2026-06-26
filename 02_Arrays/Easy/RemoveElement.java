/*
WAP: Remove Element In Place
Time Complexity: O(n)
Space Complexity: O(1)
Date: 26-june-2026
*/

public class RemoveElement {
    public static void main() {
        int[] nums = {3,2,2,3};
        int val = 3;

        int ans = removeElement(nums, val);

        System.out.println("Element after remove "+val+" is: ");
        for(int i=0; i<ans; i++) System.out.print(nums[i]+" ");
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}

/*
WAP: Binary Search
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 22-may-2026
*/

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-4,-3,-1,0,2,4,5,7,9,11};
        int target = 15;

        int ans = search(arr, target);
        if(ans==-1) System.out.print("The given target "+target+" is not present!");
        else System.out.print("The given target "+target+" is present at index "+ans);
    }

    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
}

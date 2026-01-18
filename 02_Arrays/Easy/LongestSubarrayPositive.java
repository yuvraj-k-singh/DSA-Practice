/*
WAP: Longest Subarray Positive
Time Complexity: O(n)
Space Complexity: O(1)
Date: 19-jan-2026
*/

public class LongestSubarrayPositive {
    public static int longestLength(int[] arr, int k){
        int maxLen = 0, sum = 0;
        int left = 0;

        for(int right=0; right<arr.length; right++){
            sum+=arr[right];
            //check if sum exceed, shrink window
            while(sum > k && left <= right){
                sum-=arr[left];
                left++;
            }
            //check if sum is equal to target, find max length
            if(sum==k) maxLen = Math.max(maxLen, (right-left+1));
        }

        return maxLen;
    }

    public static void main(String[] args){
        int[] arr = {10, 5, 2, 7, 1, 9};
        int target = 15;
        int ans = longestLength(arr, target);
        System.out.print("The longest Subarray length is: "+ans);
    }
}

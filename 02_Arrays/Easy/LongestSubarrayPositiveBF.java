/*
WAP: Longest Subarray Positive BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 19-jan-2026
*/

public class LongestSubarrayPositiveBF {

    public static int longestLength(int[] arr, int k){
        int maxLen = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum==k) maxLen = Math.max(maxLen, (j-i+1));
            }
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

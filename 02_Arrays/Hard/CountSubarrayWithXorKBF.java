/*
WAP: Count Subarray With Xor K BF
Time Complexity: O(N)
Space Complexity: O(N)
Date: 01-july-2026
*/

public class CountSubarrayWithXorKBF {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;

        int count = countSubbarayXORBF(nums, k);

        System.out.println("Total subarrays with Xor K: "+count);
    }

    public static int countSubbarayXORBF(int[] nums, int k){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int xor = 0;
            for(int j=i; j<nums.length; j++){
                xor ^= nums[j];
                if(xor == k) count++;
            }
        }
        return count;
    }
}

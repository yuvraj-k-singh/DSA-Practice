/*
WAP: Count Subarray With Xor K
Time Complexity: O(N)
Space Complexity: O(N)
Date: 01-july-2026
*/

import java.util.HashMap;

public class CountSubarrayWithXorK {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;

        int count = countSubbarayXOR(nums, k);

        System.out.println("Total subarrays with Xor K: "+count);
    }

    public static int countSubbarayXOR(int[] nums, int k){
        int count = 0, xor = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int x: nums){
            xor ^= x;
            if(map.containsKey(xor^k)){
                count += map.get(xor^k);
            }
            map.put(xor, map.getOrDefault(xor,0)+1);
        }

        return count;
    }
}

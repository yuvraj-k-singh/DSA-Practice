/*
WAP: Count SubArray Sum K
Time Complexity: O(n)
Space Complexity: O(n)
Date: 06-may-2026
*/

import java.util.HashMap;

public class CountSubArraySumK {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,-2,-1};
        int k = 3;

        int count = countSubarray(arr, k);

        System.out.println("The total subarray is: "+count);
    }

    public static int countSubarray(int[] arr, int k){
        int count = 0, sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}

/*
WAP: Kth Pair Difference
Time Complexity: O(n)
Space Complexity: O(n)
Date: 01-apr-2026
*/

import java.util.HashMap;

public class KthPairDifference {
    public static void main(String[] args){
        int[] arr = {1,3,1,5,4};
        int target = 0;

        int count = kthDifference(arr, target);

        System.out.println("The total pair is: "+count);
    }

    private static int kthDifference(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int key : map.keySet()){
            if(target == 0){
                if(map.get(key) > 1) count++;
            }else{
                if(map.containsKey(target + key)) count++;
            }
        }
        return count;
    }
}

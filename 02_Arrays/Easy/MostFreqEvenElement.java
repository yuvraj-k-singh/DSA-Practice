/*
WAP: Most Frequent Smallest Even Element
Time Complexity: O(N)
Space Complexity: O(N)
Date: 28-june-2026
*/

import java.util.HashMap;

public class MostFreqEvenElement {
    public static void main(String[] args){
        int[] nums = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};

        int ans = countFreqEven(nums);

        System.out.print("The smallest most frequent even no is: "+ans);
    }

    public static int countFreqEven(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE, elem = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }

        for(int x: map.keySet()){
            if(max < map.get(x) || (map.get(x) == max && x < elem)){
                elem = x;
                max = map.get(x);
            }
        }
        return elem;
    }
}

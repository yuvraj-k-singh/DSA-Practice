/*
WAP: GFG Two Sum Best Solution
Time Complexity: O(n)
Space Complexity: O(n)
Date: 01-apr-2026
*/

import java.util.HashSet;

public class GFGTwoSumBest {
    public static void main(String[] args){
        int[] arr = {1,3,6,2,3,5};
        int target = 15;

        boolean flag = twoSum(arr, target);

        if(flag) System.out.println("The given sum target "+target+" is present!");
        else System.out.println("The given sum target "+target+" is not present!");
    }

    public static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for(int x : arr){
            int rem = target - x;
            if(set.contains(rem)) return true;
            set.add(x);
        }
        return false;
    }


}

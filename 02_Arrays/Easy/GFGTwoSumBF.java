/*
WAP: GFG TwoSum BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 25-mar-2026
*/

import java.util.Arrays;

public class GFGTwoSumBF {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        boolean flag = twoSumBF(arr, target);

        if(flag) System.out.println("The given target "+target+" is Present!");
        else System.out.println("The given target "+target+" is not Present!");
    }

    private static boolean twoSumBF(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target) return true;
            }
        }
        return false;
    }
}

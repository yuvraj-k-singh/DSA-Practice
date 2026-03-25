/*
WAP: GFG TwoSum
Time Complexity: O(NLogN)
Space Complexity: O(n)
Date: 25-mar-2026
*/

import java.util.Arrays;

public class GFGTwoSum {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        boolean flag = twoSum(arr, target);

        if(flag) System.out.println("The given target "+target+" is Present!");
        else System.out.println("The given target "+target+" is not Present!");
    }

    private static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int i=0, j=arr.length-1;

        while(i<j){
            if(arr[i] + arr[j] == target){
                return true;
            }else if(arr[i] + arr[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}

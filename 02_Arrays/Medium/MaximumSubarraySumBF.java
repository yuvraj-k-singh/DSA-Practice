/*
WAP: Majority Subarray Sum BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 29-mar-2026
*/

public class MaximumSubarraySumBF {
    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        int maxSum = maximumSubarrayBF(arr);

        System.out.println("Array elements: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println("\nThe maximum subarray is: "+maxSum);
    }

    public static int maximumSubarrayBF(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}

/*
WAP: Majority Subarray Sum
Time Complexity: O(n)
Space Complexity: O(1)
Date: 29-mar-2026
*/

public class MaximumSubarraySum {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = maximumSubarray(arr);

        System.out.println("Array elements: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.println("\nThe maximum subarray is: "+maxSum);
    }

    public static int maximumSubarray(int[] arr) {
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            max = Math.max(max, sum);

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}

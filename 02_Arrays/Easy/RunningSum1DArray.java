/*
WAP: Running Sum 1D Array
Time Complexity: O(n)
Space Complexity: O(1)
Date: 20-mar-2026
*/

public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] brr = runningSum(arr);

        System.out.println("Running sum of 1D Array: ");
        for(int x : brr){
            System.out.print(x+" ");
        }
    }

    public static int[] runningSum(int[] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            arr[i] = sum;
        }
        return arr;
    }
}

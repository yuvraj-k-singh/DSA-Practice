/*
WAP: Count SubArray Sum K BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 06-may-2026
*/

public class CountSubArraySumKBF {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,3,3};
        int k = 3;

        int count = countSubarrayBF(arr, k);

        System.out.println("The total subarray is: "+count);
    }

    public static int countSubarrayBF(int[] arr, int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum==k) count++;
            }
        }
        return count;
    }
}

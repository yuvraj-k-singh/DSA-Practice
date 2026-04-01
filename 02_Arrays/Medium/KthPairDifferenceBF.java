/*
WAP: GFG Kth Pair Difference BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 01-apr-2026
*/

public class KthPairDifferenceBF {
    public static void main(String[] args){
        int[] arr = {1,3,1,5,4};
        int target = 0;

        int count = kthDifferenceBF(arr, target);

        System.out.println("The total pair is: "+count);
    }

    private static int kthDifferenceBF(int[] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] - arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }
}

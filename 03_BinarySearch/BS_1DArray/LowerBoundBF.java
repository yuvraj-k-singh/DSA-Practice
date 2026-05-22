/*
WAP: Lower Bound Element BF
Time Complexity: O(N)
Space Complexity: O(1)
Date: 22-may-2026
*/

public class LowerBoundBF {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 19;

        int ans = lowerBoundBF(arr, target);

        System.out.print("The lower bound element of target "+target+" is at index: "+ans);
    }

    private static int lowerBoundBF(int[] arr, int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= k) return i;
        }
        return arr.length;
    }
}

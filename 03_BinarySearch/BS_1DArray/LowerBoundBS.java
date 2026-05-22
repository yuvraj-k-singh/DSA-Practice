/*
WAP: Lower Bound Element BS
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 22-may-2026
*/

public class LowerBoundBS {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 3;

        int ans = lowerBoundBS(arr, target);

        System.out.print("The lower bound element of target "+target+" is at index: "+ans);
    }

    private static int lowerBoundBS(int[] arr, int k){
        int low = 0, high = arr.length-1, ans = arr.length;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] >= k){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}

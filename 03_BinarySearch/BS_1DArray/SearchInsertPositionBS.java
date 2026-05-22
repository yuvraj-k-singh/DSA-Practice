/*
WAP: Search Insert Position BS
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 22-may-2026
*/

public class SearchInsertPositionBS {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;

        int ans = searchInsertPos(arr, target);

        System.out.print("The target "+target+" should be inserted at index "+ans);
    }

    private static int searchInsertPos(int[] arr, int k){
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

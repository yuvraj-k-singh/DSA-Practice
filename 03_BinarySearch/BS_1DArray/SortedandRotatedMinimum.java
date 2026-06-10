/*
WAP: Minimum In Rotated Sorted Array 1
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 10-june-2026
*/

public class SortedandRotatedMinimum {
    public static void main(String[] args) {
        int[] arr = {7,8,0,2,3,4,5};

        int min = rotatedMin(arr);

        System.out.println("The minimum value is: "+min);
    }

    public static int rotatedMin(int[] arr){
        int low = 0, high = arr.length-1, ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans, arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}

/*
WAP: Minimum In Rotated Sorted Array 2
Time Complexity: O(N/2)
Space Complexity: O(1)
Date: 10-june-2026
*/

public class SortedandRotatedMinimum2 {
    public static void main(String[] args) {
        int[] arr = {1,1};

        int min = rotatedMin(arr);

        System.out.println("The minimum value is: "+min);
    }

    public static int rotatedMin(int[] arr){
        int low = 0, high = arr.length-1;
        int min = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                min = Math.min(min, arr[low]);
                low++;
                high--;
                continue;
            }else if(arr[low] <= arr[mid]){
                min = Math.min(min, arr[low]);
                low = mid+1;
            }else{
                min = Math.min(min, arr[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}

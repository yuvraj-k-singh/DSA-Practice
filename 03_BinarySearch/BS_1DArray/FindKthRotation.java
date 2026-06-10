/*
WAP: Find kth rotation
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 10-june-2026
*/

public class FindKthRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = kthRotation(arr);

        System.out.println("The array has been rotated by: "+ans+" times!");
    }
    public static int kthRotation(int[] arr){
        int low = 0, high = arr.length-1;
        int min = Integer.MAX_VALUE, rotation = -1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[low] <= arr[mid]){
                if(min > arr[low]){
                    min = arr[low];
                    rotation = low;
                }
                low = mid+1;
            }else{
                if(min > arr[mid]){
                    min = arr[mid];
                    rotation = mid;
                }
                high = mid-1;
            }
        }
        return rotation;
    }
}

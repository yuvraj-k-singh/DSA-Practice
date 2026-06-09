/*
WAP: Search In Rotated Sorted Array 1
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 09-june-2026
*/

public class SearchInRotatedSArray_1 {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int x = 5;

        int index = searchRotated1(arr, x);
        if(index == -1) System.out.println("The target element "+x+" is not available!");
        else System.out.println("The target element "+x+" is available at index "+index);
    }

    public static int searchRotated1(int[] arr, int x){
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == x) return mid;
            else if(arr[low] <= arr[mid]){
                if(arr[low]<=x && x<=arr[mid]){
                    high = mid-1;
                }else low = mid+1;
            }else{
                if(arr[mid]<=x && x<=arr[high]){
                    low = mid+1;
                }else high = mid-1;
            }
        }
        return -1;
    }
}

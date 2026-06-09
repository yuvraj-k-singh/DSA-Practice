/*
WAP: Search In Rotated Sorted Array 2
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 09-june-2026
*/

public class SearchInRoatatedSArray_2 {
    public static void main(String[] args){
        int[] arr = {2,5,6,0,0,1,2};
        int x = 100;

        boolean flag = searchRotated2(arr, x);
        if(!flag) System.out.println("The target element "+x+" is not available!");
        else System.out.println("The target element "+x+" is available!");
    }

    public static boolean searchRotated2(int[] arr, int x){
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == x) return true;

            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }else if(arr[low] <= arr[mid]){
                if(arr[low]<=x && x<=arr[mid]){
                    high = mid-1;
                }else low = mid+1;
            }else{
                if(arr[mid]<=x && x<=arr[high]){
                    low = mid+1;
                }else high = mid-1;
            }
        }
        return false;
    }
}

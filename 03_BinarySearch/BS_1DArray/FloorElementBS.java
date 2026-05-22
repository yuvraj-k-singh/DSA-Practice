/*
WAP: Floor Element BS
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 22-may-2026
*/

public class FloorElementBS {
    public static void main() {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 10;

        int ans = floorElement(arr, x);

        if(ans == -1) System.out.print("The floor element of target "+x+" is not available!");
        else System.out.print("The floor element of target "+x+" is: "+ans);
    }

    public static int floorElement(int[] arr, int x){
        int low=0, high=arr.length-1, indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] > x) high = mid-1;
            else{
                indx = mid;
                low = mid+1;
            }
        }
        return indx;
    }
}

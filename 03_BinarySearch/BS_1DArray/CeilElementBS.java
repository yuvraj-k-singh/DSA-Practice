/*
WAP: Ceil Element BS
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 22-may-2026
*/

public class CeilElementBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 20;

        int ans = ceilElement(arr, x);

        if(ans == -1) System.out.print("The ceil element of target "+x+" is not available!");
        else System.out.print("The ceil element of target "+x+" is: "+ans);
    }

    public static int ceilElement(int[] arr, int x){
        int low=0, high=arr.length-1, indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] < x) low = mid+1;
            else{
                indx = mid;
                high = mid-1;
            }
        }
        return indx;
    }
}

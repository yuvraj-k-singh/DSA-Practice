/*
WAP: Find peak element
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 10-june-2026
*/

public class FindPeakElement {
    public static void main(String[] args){
        int[] arr = {10,9,3,4,4};
        int ans = peakElement(arr);

        System.out.println("The peak element is: "+ans);
    }

    public static int peakElement(int[] arr){
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;

        int low=1, high = arr.length-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low = mid+1;
            }else high = mid-1;
        }
        return -1;
    }
}

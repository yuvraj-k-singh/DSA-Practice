/*
WAP: First and Last Position of X BS
Time Complexity: O(2logN)
Space Complexity: O(1)
Date: 09-june-2026
*/

import java.util.ArrayList;

public class findFirstLastPositionBS {
    public static void main(String[] args){
        int[] arr = {5,7,7,8,8,10};
        int target =  12;

        ArrayList<Integer> ans = firstAndLast(arr, target);

        System.out.print("First and last occurrence of "+target+" is: "+ans);
    }

    public static ArrayList<Integer> firstAndLast(int[] arr, int x){
        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }

    private static int firstOccurrence(int[] arr, int x){
        int low=0, high=arr.length-1;
        int indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == x){
                indx = mid;
                high = mid-1;
            }else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        return indx;
    }

    private static int lastOccurrence(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == x){
                indx = mid;
                low = mid+1;
            }else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        return indx;
    }
}

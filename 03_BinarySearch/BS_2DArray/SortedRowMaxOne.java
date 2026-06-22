/*
WAP: Sorted Row With Max One
Time Complexity: O(M*logN)
Space Complexity: O(1)
Date: 22-june-2026
*/

public class SortedRowMaxOne {
    public static void main(String[] args){
        int[][] arr = {{0,1,1},{0,0,1},{0,0,0}};

        int ans = maxRowOnesSorted(arr);

        System.out.print("Row with max ones is: "+ans);
    }

    public static int maxRowOnesSorted(int[][] arr){
        int m = arr.length, n = arr[0].length;
        int max = 0, indx = -1;

        for(int i=0; i<m; i++){
            int ones = n - firstOccurrence(arr[i], n, 1);
            if(ones > max){
                max = ones;
                indx = i;
            }
        }
        return indx;
    }

    private  static int firstOccurrence(int[] arr, int len, int x){
        int low = 0, high  = len-1;
        int ans = len;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}
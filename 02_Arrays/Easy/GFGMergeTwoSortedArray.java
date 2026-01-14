/*
WAP: GFG Merge Two Sorted Array
Time Complexity: O(m+n)
Space Complexity: O(m+n)
Date: 14-jan-2026
*/

public class GFGMergeTwoSortedArray {

    public static int[] mergeArrays(int[] arr, int[] brr){
        int i=0, j=0, k=0;
        int[] crr = new int[arr.length + brr.length];
        while(i<arr.length && j<brr.length){
            crr[k++] = (arr[i] < brr[j]) ? arr[i++] : brr[j++];
        }

        //if arr is over
        while(j<brr.length){
            crr[k++] = brr[j++];
        }

        //if brr is over
        while(i<arr.length){
            crr[k++] = arr[i++];
        }

        return crr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        int[] brr = {2,5,6};

        int[] res = mergeArrays(arr, brr);

        System.out.println("Merged array elements are: ");
        for(int x : res){
            System.out.print(x + " ");
        }
    }
}

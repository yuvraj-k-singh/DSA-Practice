/*
WAP: GFG Check Sorted Array
Time Complexity: O(n)
Space Complexity: O(1)
Date: 14-jan-2026
*/

public class GFGCheckSortedArray {

    public static boolean checkSorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,5,7,8};

        System.out.println("Array elements are: ");
        for(int x : arr) System.out.print(x +" ");

        boolean flag = checkSorted(arr);

        System.out.println();
        if(flag) System.out.print("\nThe given array is sorted!");
        else System.out.print("\nThe given array is not sorted!");
    }
}

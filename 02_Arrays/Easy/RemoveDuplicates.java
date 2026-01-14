/*
WAP: Remove Duplicates
Time Complexity: O(n)
Space Complexity: O(1)
Date: 14-jan-2026
*/

public class RemoveDuplicates {

    public static int removeDuplicate(int[] arr){
        int count = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]) arr[count++] = arr[i];
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3,4,5};

        System.out.println("Array elements before are: ");
        for(int x : arr) System.out.print(x + " ");

        int n = removeDuplicate(arr);

        System.out.println();
        System.out.println("\nArray elements after are: ");
        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
    }
}

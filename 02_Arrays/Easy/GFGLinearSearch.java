/*
WAP: GFG Linear Search
Time Complexity: O(n)
Space Complexity: O(1)
Date: 14-jan-2026
*/

public class GFGLinearSearch {

    public static int linearSearch(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,10,5,6,7};
        int x = 11;

        System.out.println("Array elements are: ");
        for(int elem : arr) System.out.print(elem +" ");

        int index = linearSearch(arr, x);

        System.out.println();
        if(index!=-1) System.out.print("\nThe given element " + x + " is present in Array at "+index);
        else System.out.print("\nThe given element " + x + " is not present in Array!");
    }
}

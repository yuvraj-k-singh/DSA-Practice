/*
WAP: GFG Selection Sort
Time Complexity: O(n^2)
Space Complexity: O(1)
Date: 31-jan-2025
*/

public class GFGSelectionSort {
    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int min = Integer.MAX_VALUE, minIndex = 0;
            for(int j=i; j<arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void main(String[] args){
        int[] arr = {1,4,5,3,5,-5,9,7};

        System.out.println("Before selection sort: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("\nAfter selection sort: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

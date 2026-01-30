/*
WAP: GFG Bubble Sort
Time Complexity: O(n^2)
Space Complexity: O(1)
Date: 30-jan-2025
*/

public class GFGBubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,4,6,3,2,6,-3,4};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("\nArray elements after: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

/*
WAP: GFG Wave Array
Time Complexity: O(n-1)
Space Complexity: O(1)
Date: 11-jan-2026
 */

public class GFGWaveArray {

    public static void waveArray(int[] arr){
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x+ " ");
        }

        waveArray(arr);

        System.out.println();
        System.out.println("\nArray elements after: ");
        for(int x : arr){
            System.out.print(x+ " ");
        }
    }
}

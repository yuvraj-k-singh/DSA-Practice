/*
WAP: GFG Left Rotate Array
Time Complexity: O(n)
Space Complexity: O(1)
Date: 10-jan-2026
 */

import java.util.Scanner;

public class GFGLeftRotateArray {
    public static int[] rotate(int[] arr, int k, int n) {
        rev(arr, 0, k-1);
        rev(arr, k, n-1);
        rev(arr, 0, n-1);
        return arr;
    }

    public static void rev(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of K steps: ");
        int k = sc.nextInt();

        k = k%n; // to find k value

        System.out.println();
        System.out.println("Arrays element before left rotation: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        rotate(arr, k, n);

        System.out.println();
        System.out.println("\nArrays element after left rotation: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

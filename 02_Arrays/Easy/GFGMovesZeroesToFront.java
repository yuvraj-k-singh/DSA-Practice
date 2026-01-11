/*
WAP: GFG Moves Zeroes To Front
Time Complexity: O(n)
Space Complexity: O(1)
Date: 10-jan-2026
*/

public class GFGMovesZeroesToFront {
    public static int[] movesZeroes(int[] arr) {
        int nonZeroes = arr.length -1;
        for(int i=arr.length -1; i>=0; i--){
            if(arr[i]!=0){
                int temp = arr[nonZeroes];
                arr[nonZeroes] = arr[i];
                arr[i] = temp;
                nonZeroes--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        System.out.println("Array element before: ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        movesZeroes(arr);

        System.out.println();
        System.out.println("\nArray element before: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

/*
WAP: Moves Zeroes To End BF
Time Complexity: O(2n)
Space Complexity: O(n)
Date: 10-jan-2026
*/

public class MovesZeroesToEndBF {
    public static int[] movesZeroes(int[] arr) {
        int[] temp = new int[arr.length];
        int nonZeroes = 0;

        //storing nonZeroes to new array
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[nonZeroes++] = arr[i];
            }
        }

        //copy back to original array
        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
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

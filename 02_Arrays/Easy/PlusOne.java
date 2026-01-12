/*
WAP: Plus One
Time Complexity: O(n)
Space Complexity: O(n) if all 9,9 or O(1) if 1,2,3
Date: 12-jan-2026
*/


public class PlusOne {
    public static int[] plusOne(int[] arr){
        for(int i = arr.length - 1; i>=0; i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            //if arr[i] greater or equal than 9
            arr[i] = 0;
        }
        //if still carry is one then need to increase size
        arr = new int[arr.length + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {9};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        int[] ans = plusOne(arr);

        System.out.println();
        System.out.println("\nArray elements after: ");
        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}

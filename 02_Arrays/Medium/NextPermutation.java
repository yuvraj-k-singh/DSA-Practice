/*
WAP: Next Permutation
Time Complexity: O(n)
Space Complexity: O(1)
Date: 31-mar-2026
*/

public class NextPermutation{
    public static void main(String[] args){
        int[] arr = {1,2,3};

        nextPermutation(arr);

        System.out.println("Next permutation: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    public static void nextPermutation(int[] arr){
        int indx = -1;

        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                indx = i;
                break;
            }
        }

        if(indx == -1){
            reverse(arr, 0, arr.length-1);
            return;
        }

        for(int i=arr.length-1; i>indx; i--){
            if(arr[indx] < arr[i]){
                swap(arr, indx, i);
                break;
            }
        }

        reverse(arr, indx+1, arr.length-1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

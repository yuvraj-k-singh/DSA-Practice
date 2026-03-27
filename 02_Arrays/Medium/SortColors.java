/*
WAP: Sort Colors Optimal Solution
Time Complexity: O(N)
Space Complexity: O(1)
Date: 27-mar-2026
*/

public class SortColors {
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};

        sortColors(arr);

        System.out.println("Array elements after: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void sortColors(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }
}

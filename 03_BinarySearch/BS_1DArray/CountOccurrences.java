/*
WAP: Count Number of Occurrences
Time Complexity: O(logN)
Space Complexity: O(1)
Date: 09-june-2026
*/

public class CountOccurrences {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,2,3};
        int x = 5;

        int count = countOccurrence(arr, x);
        System.out.println("The number of occurrence of "+x+" is: "+count);
    }

    public static int countOccurrence(int[] arr, int x){
        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);
        return (first == -1 ? 0 : (last-first)+1);
    }

    private static int firstOccurrence(int[] arr, int x){
        int low=0, high=arr.length-1;
        int indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == x){
                indx = mid;
                high = mid-1;
            }else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        return indx;
    }

    private static int lastOccurrence(int[] arr, int x){
        int low = 0, high = arr.length-1;
        int indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == x){
                indx = mid;
                low = mid+1;
            }else if(arr[mid] > x) high = mid-1;
            else low = mid+1;
        }
        return indx;
    }
}

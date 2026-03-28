/*
WAP: Majority Element
Time Complexity: O(2n)
Space Complexity: O(1)
Date: 28-mar-2026
*/

public class GFGMajorityElement {
    public static void main(String[] args){
        int[] arr = {2, 13};

        int element = majorityElement(arr);

        System.out.println("Array elements: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.print("\nMajority element is: "+element);
    }
    public static int majorityElement(int[] arr) {
        int count = 0, element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                element = arr[i];
                count = 1;
            } else if (element == arr[i]) {
                count++;
            } else count--;
        }

        //To verify
        int check = 0;
        for(int x : arr){
            if(element==x) check++;
        }

        if(check > Math.floor(arr.length/2)){
            return element;
        }
        return -1;
    }
}

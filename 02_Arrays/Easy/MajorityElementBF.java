/*
WAP: Majority Element BF
Time Complexity: O(n*2)
Space Complexity: O(1)
Date: 28-mar-2026
*/

public class MajorityElementBF {
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};

        int element = majorityElementBF(arr);

        System.out.println("Array elements: ");
        for(int x: arr){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.print("\nMajority element is: "+element);
    }

    public static int majorityElementBF(int[] arr){
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > Math.floor(arr.length/2)){
                return arr[i];
            }
        }
        return -1;
    }
}

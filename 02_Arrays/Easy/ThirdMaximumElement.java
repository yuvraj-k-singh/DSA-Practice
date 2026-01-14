/*
WAP: Third Maximum Element
Time Complexity: O(n)
Space Complexity: O(1)
Date: 14-jan-2026
*/

public class ThirdMaximumElement {

    public static int thirdMax(int[] arr){
        long a = Long.MIN_VALUE, b = Long.MIN_VALUE, c = Long.MIN_VALUE;

        for(int x : arr){

            //this condition will skip duplicates
            if(x == a || x == b || x == c) continue;

            if(a < x){
                c = b;
                b = a;
                a = x;
            }else if(b < x){
                c = b;
                b = x;
            }else if(c < x){
                c = x;
            }
        }

        return (c == Long.MIN_VALUE) ? (int)a : (int)c;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,5,1};

        int max = thirdMax(arr);

        System.out.print("The third max element is: "+max);
    }
}

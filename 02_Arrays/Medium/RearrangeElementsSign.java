/*
WAP: Rearrange Elements By Sign
Time Complexity: O(n)
Space Complexity: O(n)
Date: 19-jan-2026
*/

public class RearrangeElementsSign {
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};

        int[] ans = rearrangeElements(arr);

        System.out.println("Elements after rearrange: ");
        for(int x : ans){
            System.out.print(x+" ");
        }
    }
    public static int[] rearrangeElements(int[] arr) {
        int[] ans = new int[arr.length];
        int pos = 0, neg = 1;

        for(int x : arr){
            if(x < 0){
                ans[neg] = x;
                neg+=2;
            }else{
                ans[pos] = x;
                pos+=2;
            }
        }

        return ans;
    }
}

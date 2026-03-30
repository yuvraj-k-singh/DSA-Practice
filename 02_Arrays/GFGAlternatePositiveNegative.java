/*
WAP: GFG Alternate Positive Negative
Time Complexity: O(n)
Space Complexity: O(1)
Date: 29-mar-2026
*/

import java.util.ArrayList;

public class GFGAlternatePositiveNegative {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(9);
        ans.add(4);
        ans.add(-2);
        ans.add(-1);
        ans.add(5);
        ans.add(0);
        ans.add(-5);
        ans.add(-3);
        ans.add(2);

        reArrangeElement(ans);
        System.out.println("Arrays elements: ");
        for(int x : ans) {
            System.out.print(x+" ");
        }
    }

    public static void reArrangeElement(ArrayList<Integer> ans){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int x : ans) {
            if(x < 0) neg.add(x);
            else pos.add(x);
        }

        int i=0, j=0, k=0;
        while(i<pos.size() && j<neg.size()){
            if(k%2==0){
                ans.set(k++, pos.get(i++));
            }else{
                ans.set(k++, neg.get(j++));
            }
        }

        while(i<pos.size()){
            ans.set(k++, pos.get(i++));
        }

        while(j<neg.size()){
            ans.set(k++, neg.get(j++));
        }
    }
}

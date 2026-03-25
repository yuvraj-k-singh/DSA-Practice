/*
WAP: GFG Union Elements
Time Complexity: O(NlogN)
Space Complexity: O(n+m)
Date: 26-mar-2026
*/

import java.util.ArrayList;

public class GFGUnionElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};

        ArrayList<Integer> ans = findUnion(a, b);
        System.out.println("Union elements: ");
        for(int x : ans){
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0, j=0;

        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                if(ans.size() == 0 || ans.get(ans.size()-1)!=a[i]){
                    ans.add(a[i]);
                }
                i++;
            }else if(b[j] < a[i]){
                if(ans.size() == 0 || ans.get(ans.size()-1)!=b[j]){
                    ans.add(b[j]);
                }
                j++;
            }else{
                if(ans.size() == 0 || ans.get(ans.size()-1)!=a[i]){
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        while(i<a.length){
            if(ans.size() == 0 || ans.get(ans.size()-1)!=a[i]){
                ans.add(a[i]);
            }
            i++;
        }

        while(j<b.length){
            if(ans.size() == 0 || ans.get(ans.size()-1)!=b[j]){
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}

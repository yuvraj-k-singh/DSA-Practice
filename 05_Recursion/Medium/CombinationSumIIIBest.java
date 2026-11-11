/*
WAP: Combination Sum III Best
Time Complexity: O(2^9 x N(size))
Space Complexity: O(N x C(no of combination))
Date: 11-nov-2026
*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIIIBest {
    public static void main(String[] args){
        int n = 3, k = 7;
        List<List<Integer>> ans = cSum(n, k);

        System.out.println("Answer: ");
        for(List<Integer> li: ans){
            for(int x: li){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> cSum(int n, int k){
        List<List<Integer>> list = new ArrayList<>();
        combination(1, n, k, new ArrayList<>(), list);
        return list;
    }

    private static void combination(int start, int n, int k, ArrayList<Integer> ans, List<List<Integer>> list) {
        if(ans.size() == n){
            if(k == 0){
                list.add(new ArrayList<>(ans));
            }
            return;
        }

        for(int i=start; i<=9; i++){
            if(i > k) break;
            ans.add(i);
            combination(i+1, n, k-i, ans, list);
            ans.remove(ans.size()-1);
        }
    }
}

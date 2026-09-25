/*
WAP: Three Sum Closest Optimal
Time Complexity: O(N^2)
Space Complexity: O(N)
Date: 25-sep-2026
*/
public class ThreeSumClosestOptimal {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;

        int ans = threeSumClosest(nums, target);
        System.out.println("ANSWER: "+ans);
    }

    public static int threeSumClosest(int[] nums, int target){
        int ans = nums[0]+nums[1]+nums[2], n = nums.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = nums[i]+nums[j]+nums[k];

                    if(Math.abs(sum - target) < Math.abs(ans - target)){
                        ans = sum;
                    }

                    if(sum == target) return sum;
                }
            }
        }
        return ans;
    }
}

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;


        for(int i=start;i<nums.length;i++){
            if(nums[i]==target){
                ans=Math.abs(i-start);
                break;
            }
        }
        for(int i=start;i>=0;i--){
            if(nums[i]==target){
                ans2=Math.abs(i-start);
                break;
                
            }
        }
        return Math.min(ans,ans2);
    }
}
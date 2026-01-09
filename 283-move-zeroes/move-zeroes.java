class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        int nz=0;
        for(nz=0;nz<nums.length;nz++){
            if(nums[nz]!=0 && nums[z]==0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] =temp;
            }
            if(nums[z]!=0){
                z++;
            }
        }
    }
}
class Solution {
    public int[] runningSum(int[] nums) {
        int [] prefixarr=new int[nums.length];
        prefixarr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixarr[i]=nums[i]+prefixarr[i-1];
        }
        return prefixarr;
    }
}
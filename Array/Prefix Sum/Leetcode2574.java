class Solution {
    public int[] leftRightDifference(int[] nums) {
        int size=nums.length;
        int[] leftsum=new int[size];
        int[] rightsum=new int[size];
        int [] newnums=new int[size];
        leftsum[0]=0;
        rightsum[size-1]=0;

        for(int i=1;i<size;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
            rightsum[size-i-1]=rightsum[size-i]+nums[size-i];
        }
        for(int i=0;i<size;i++){
            int temp=leftsum[i]-rightsum[i];
            if(temp<0){
                temp=temp*-1;
            }
            newnums[i]=temp;
        }
        return newnums;
    }
}
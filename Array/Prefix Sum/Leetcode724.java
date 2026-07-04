
class Solution {
    public int pivotIndex(int[] nums) {
        int [] arr=new int[nums.length+1];
        arr[0]=0;
        for(int i=1;i<=nums.length;i++){
            arr[i]=arr[i-1]+nums[i-1];
        }
        boolean cond=false;
        int pivot=0;
        int left=0;
        int right=arr[nums.length];
        for(int i=1;i<arr.length;i++){
            int lleft=left +arr[i-1];
            int rright=right-arr[i];
                


            if(lleft==rright){
                pivot=i-1;
                cond=true;
                break;
            }
        }
        if(cond==true){
            return pivot;
        }else return -1;

    }
}

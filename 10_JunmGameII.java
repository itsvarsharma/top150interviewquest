class Solution {
    public int jump(int[] nums) {
        int far=0,step=0,curr=0;
        for(int i=0;i<nums.length;i++){
            far=Math.max(far,i+nums[i]);
            if(curr>=nums.length-1)
                break;
            if(i==curr){
                step++;
                curr=far;
            }
        }
        return step;
    }
}

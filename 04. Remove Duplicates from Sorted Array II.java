class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)return nums.length;
        int ind=2;int c=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==nums[ind-1] && nums[i]==nums[ind-2]){
                continue;
            }else{
                nums[ind++]=nums[i];
            }
        }
        return ind;
    }
}

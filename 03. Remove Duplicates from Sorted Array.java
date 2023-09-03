class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,ind=0;
        while(i<nums.length){
            if(nums[i]==nums[ind])i++;
            else nums[++ind]=nums[i];
        }
        return ind+1;
    }
}

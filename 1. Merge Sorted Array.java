class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,k=m+n;
        while(k>0){
            k--;
            if(i==-1) nums1[k]=nums2[j--]; 
            else if(j==-1) nums1[k]=nums1[i--]; 
            else if(nums2[j]>=nums1[i]) nums1[k]=nums2[j--];
            else if(nums1[i]>nums2[j]) nums1[k]=nums1[i--];
        }
    }
}

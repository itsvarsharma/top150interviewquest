class Solution {
    public int hIndex(int[] citations){
        int l=0,r=0,ans=0;
        for(int n:citations) 
          r=Math.max(r,n);
      
        while(l<=r){
            int mid=l+(r-l)/2;
            if(index(citations,mid)){
                ans=Math.max(ans,mid);
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
  
    public boolean index(int[] arr, int key){
        int count=0;
        for(int i:arr){
            if(i>=key)count++;
            if(count>=key)return true;
        }
        return false;
    }
}

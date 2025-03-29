class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int res[] = new int[n];
       int leftproduct=1;
       for(int i=0;i<n;i++){
        res[i]=leftproduct;
        leftproduct *=nums[i];
       } 
       int rightproduct=1;
       for(int i=n-1;i>=0;i--){
        res[i] *= rightproduct;
        rightproduct *= nums[i];
       }
       return res;
    }
}
class Solution {
    public int trap(int[] height) {
        int h=height.length;
        int lh=0;
        int rh=0;
        int start=0;
        int end=h-1;
        int water=0;
        while(start<end){
            lh=Math.max(lh,height[start]);
            rh=Math.max(rh,height[end]);
            if(lh<rh){
                water+=lh-height[start];
                start++;
            }
            else{
                water+=rh-height[end];
                end--;
            }
        }
        return water;
   }
}
class Solution {
    public void sortColors(int[] nums) {
         int one=0;
         int two=0;
         int zero=0;
         for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    zero++;
                }
                else if(nums[i]==1){
                    one++;
                }else{
                    two++;
                }
         }
                int j=0;
                while(zero-->0){
                    nums[j++]=0;
                }
                while(one-->0){
                    nums[j++]=1;
                }
                while(two-->0){
                    nums[j++]=2;
                }
    }
}
class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int t=0;
        if(sum%2!=0){
            return false;
        }
        t=sum/2;
        boolean  dp[][]=new boolean[nums.length][t+1];
        dp[0][0]=true;
        for(int i=0;i<nums.length;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=t){
            dp[0][nums[0]]=true;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<t+1;j++){
                if(i>0){
                if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
                }
                if(j>=nums[i]&&j>0&&i>0){
                if(dp[i-1][j-nums[i]]==true){
                    dp[i][j]=true;
                }
                }
            }
        }
        return dp[nums.length-1][t];

    }
}
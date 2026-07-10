class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        int INF=100000000;
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<amount+1;j++){
                dp[i][j]=INF;
            }
        }
        dp[0][0]=0;
        for(int i=0;i<coins.length;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<amount+1;j++){
                if(i>0){
                    dp[i][j]=dp[i-1][j];
                }
                if(j>=coins[i]&&dp[i][j-coins[i]]!=INF){
                    dp[i][j]=Math.min(dp[i][j],1+dp[i][j-coins[i]]);
                }
            }
        }
        if(dp[coins.length-1][amount]==INF){
            return -1;
        }
        return dp[coins.length-1][amount];
    }
}
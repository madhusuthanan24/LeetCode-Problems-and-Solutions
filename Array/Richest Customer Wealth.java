class Solution {
    public int maximumWealth(int[][] accounts) {
       int rich=0;
       for(int []i:accounts){
         int s=0;
         for(int o:i){
            s+=o;
         }
         rich=Math.max(rich,s);
       }
       return rich;
    }
}
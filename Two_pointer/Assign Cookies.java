class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c=s.length;
        if(c==0)return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int max=0;
        int ci=c-1;
        int chi=g.length-1;
        while(ci>=0&&chi>=0){
            if(s[ci]>=g[chi]){
                max++;
                ci--;
                chi--;
            }else{
                chi--;
            }
        }
        return max;
    }
}
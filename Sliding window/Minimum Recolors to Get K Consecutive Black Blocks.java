class Solution {
    public int minimumRecolors(String b, int k) {
        int min=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(b.charAt(i)=='W'){
                count++;
            }
        }
        min=count;
        int i=0;
        for(int j=k;j<b.length();j++){
            if(b.charAt(i)=='W'){
                count--;
            }
            if(b.charAt(j)=='W'){
                count++;
            }
            i++;
            min=Math.min(min,count);
            
        }
        return min;
    }
}
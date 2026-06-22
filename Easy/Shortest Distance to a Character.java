class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length(),pos=-n,result[]=new int[n];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                pos=i;
            }
            result[i]=i-pos;
        }
        for(int i =pos-1;i>=0;i--){
            if(s.charAt(i)==c){
                pos=i;
            }
            result[i]=Math.min(result[i],pos-i);
        }
        return result;
    }
}
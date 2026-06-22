class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            char c[]=words[i].toCharArray();
            int a=0;
            int j=c.length-1;
            boolean flag=true;
            while(a<j){
                if(c[a]!=c[j]){
                    flag=false;
                    break;
                }
                a++;
                j--;
            }
            if(flag){
            return words[i];
            }
        }
        return "";
    }
}
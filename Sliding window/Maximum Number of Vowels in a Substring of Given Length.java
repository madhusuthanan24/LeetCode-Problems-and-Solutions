class Solution {
    public int maxVowels(String s, int k) {
        int m=0;
        int c=0;
        for(int i=0;i<k;i++){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                c++;
            }
        }
        m=c;
        if(m==k){
            return k;
        }
        int i=0;
        int j=k;
        while(i<s.length()-k){
            if("aeiou".indexOf(s.charAt(i))!=-1){
                c--;
            }
            if("aeiou".indexOf(s.charAt(j))!=-1){
                c++;
            }
            i++;
            j++;
            m=Math.max(m,c);
        }
        return m;
    }
}
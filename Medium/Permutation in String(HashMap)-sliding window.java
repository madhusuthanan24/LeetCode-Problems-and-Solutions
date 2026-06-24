class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
                return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>result=new HashMap<>();
        for(char c:s1.toCharArray()){
            map.put(c,(map.getOrDefault(c,0)+1));
        }
        for(int i=0;i<s1.length();i++){
            result.put(s2.charAt(i),result.getOrDefault(s2.charAt(i),0)+1);
            if(result.equals(map)){
                return true;
            }
        }
        int i=0;
        int j=s2.length()-s1.length();
        int k=s1.length();
        while(i<j){
            char ch=s2.charAt(i);
            result.put(ch,result.get(ch)-1);
            if(result.get(ch)==0){
                result.remove(ch);
            }
            result.put(s2.charAt(k),result.getOrDefault(s2.charAt(k),0)+1);
            if(result.equals(map)){
                return true;
            }
            i++;
            k++;
        }
        return false; 
    }
}
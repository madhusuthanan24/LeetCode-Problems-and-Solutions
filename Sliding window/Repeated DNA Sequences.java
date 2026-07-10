class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String>s1=new HashSet<>();
        HashSet<String>s2=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String sub=s.substring(i,i+10);
            if(s1.contains(sub)){
                s2.add(sub);
            }
            s1.add(sub);
        }
        return new ArrayList<>(s2);
    }
}
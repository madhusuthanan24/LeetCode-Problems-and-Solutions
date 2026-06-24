class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n1=s.length();
        int n2=p.length();
        ArrayList<Integer>list=new ArrayList<>();
        if(n1<n2){
            return list;
        }
        int count1[]=new int[26];
        int count2[]=new int[26];
        for(int i=0;i<n2;i++){
            count1[s.charAt(i)-'a']++;
            count2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(count1,count2)) list.add(0);
        int i=0;
        int j=n1-n2;
        int k=n2;
        while(i<j){
            count1[s.charAt(i)-'a']--;
            count1[s.charAt(k)-'a']++;
            i++;
            k++;
            if(Arrays.equals(count1,count2)) list.add(i);
        }
        return list;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> u=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                u.add(num);
            }
        }
        int result[]=new int[u.size()];
        int i=0;
        for(int num:u){
            result[i++]=num;
        }
        return result;
    }
}
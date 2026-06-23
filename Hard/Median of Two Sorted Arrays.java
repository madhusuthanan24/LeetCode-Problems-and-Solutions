class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int arr[]=new int[n];
        int d=0;
        for(int i=0;i<nums1.length;i++){
            arr[d++]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[d++]=nums2[j];
        }
        Arrays.sort(arr);
        if(arr.length%2==0){
            return (arr[n/2-1]+arr[n/2])/2.0;
        }
        return arr[n/2];
    }
}
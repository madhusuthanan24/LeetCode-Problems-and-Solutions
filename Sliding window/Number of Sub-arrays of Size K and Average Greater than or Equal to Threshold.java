class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int f=sum/k;
        if(threshold<=f){
            count++;
        }
        int i=0;
        for(int j=k;j<arr.length;j++){
            sum-=arr[i];
            sum+=arr[j];
            f=sum/k;
            if(threshold<=f){
                count++;
            }
            i++;
        }
        return count;
    }
}
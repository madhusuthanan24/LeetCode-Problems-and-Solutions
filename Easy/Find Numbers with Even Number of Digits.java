class Solution {
    public int findNumbers(int[] nums) {
        int arr[]=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]).length();
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
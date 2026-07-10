class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;
        Rotate(nums,0,l-1);
        Rotate(nums,0,k-1);
        Rotate(nums,k,l-1);
    }
    void Rotate(int nums[],int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int[code.length];
        if(k>0){
            int sum=0;
            for(int i=0;i<k;i++){
                sum+=code[i];
            }
            int j=k;
            for(int i=0;i<code.length;i++){
                sum-=code[i];
                sum+=code[j%code.length];
                arr[i]=sum;
                j++;
            }
        }
        if(k<0){
            for(int i=0;i<code.length;i++){
            int sum=0;
            int j=i-1;
            int temp=k;
            while(temp!=0){
                if(j>=0){
                sum+=code[j];
                }
                else{
                    sum+=code[code.length+j];
                }
                j--;
                temp++;
            }
            arr[i]=sum;
            }
        }
        return arr;
    }
}
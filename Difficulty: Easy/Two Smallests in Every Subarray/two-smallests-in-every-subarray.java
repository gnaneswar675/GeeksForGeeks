class Solution {
    public int maxSum(int[] arr) {
        // code here
        if(arr.length<2)return -1;
        int res=0;
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i]+arr[i+1];
            res=Math.max(temp,res);
        }
        return res;
    }
}

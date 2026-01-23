class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int cursum=0;
        for(int i=0;i<k;i++){
            cursum+=arr[i];
        }
        int res=cursum;
        for(int i=1;i<=arr.length-k;i++)
        {
            cursum=cursum-arr[i-1]+arr[k+i-1];
            res=Math.max(res,cursum);
        }
        return res;
    }
}
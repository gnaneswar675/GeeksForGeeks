class Solution {
    public static int chocolates(int n, int[] arr) {
        // code here
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=Math.min(arr[i],res);
        }
        return res;
    }
}

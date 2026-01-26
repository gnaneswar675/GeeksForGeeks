class Solution {
    public int minDiff(int[] arr) {
        // code here
        Arrays.sort(arr);
        int res=Math.abs(arr[0]-arr[1]);
        for(int i=1;i<arr.length-1;i++){
            res=Math.min(res,Math.abs(arr[i]-arr[i+1]));
        }return res;
    }
}

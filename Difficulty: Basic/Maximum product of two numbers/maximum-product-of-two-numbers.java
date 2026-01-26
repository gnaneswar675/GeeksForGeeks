
class Solution {
    public static int maxProduct(int[] arr) {
        // code here
       //int res=arr[0]*arr[1];
        //f//or(int i=1;i<arr.length-1;i++){
            //res=Math.max(res,arr[i]*arr[i+1]);
        //}return res;
        Arrays.sort(arr);
        return arr[arr.length-1]*arr[arr.length-2];
    }
}

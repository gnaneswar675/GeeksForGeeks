class Solution {
    int sum(int i,int[]arr){
        if(i>=arr.length-1)return 0;
        return arr[i]+=sum(i+1,arr);
    }
    int sumExceptFirstLast(int[] arr) {
        // your code here
        return sum(1,arr);
    }
}
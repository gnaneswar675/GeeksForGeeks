// User function Template for Java//User function Template for Java
class Solution {
    public static void traverse(int cur,int arr[],int sum,List<Integer> res){
        if(cur==arr.length){
            res.add(sum);
            return;
        }
        sum+=arr[cur];
        traverse(cur+1,arr,sum,res);
        sum-=arr[cur];
        traverse(cur+1,arr,sum,res);
        
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        traverse(0,arr,0,res);
        return res;
    }
}
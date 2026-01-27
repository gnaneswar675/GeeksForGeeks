class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList <Integer> res=new ArrayList<>();
        int n=adj.size();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                dfstraversal(adj,i,vis,res);
            }
        }
        return res;
    }
    public void dfstraversal(ArrayList<ArrayList<Integer>> list,int src,boolean[] vis,ArrayList <Integer> res)
    {
        res.add(src);
        vis[src]=true;
        for(int i:list.get(src))
        {
            if(!vis[i])
            {
                dfstraversal(list,i,vis,res);
            }
        }
    }
}
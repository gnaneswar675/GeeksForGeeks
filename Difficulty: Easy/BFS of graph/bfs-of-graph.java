class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int v=adj.size();
        boolean vis[]=new boolean[v];
        for(int i=0;i<v;i++)
        {
            if(!vis[i])
            {
                bfstraversal(adj,i,vis,res);
            }
        }
        return res;
    }
    public void bfstraversal(ArrayList<ArrayList<Integer>> adj,int src,boolean[] vis,ArrayList<Integer> res)
    {
       
        Queue<Integer>q=new LinkedList<>();
         q.add(src);
        vis[src]=true;
        while(!q.isEmpty())
        {
            int temp=q.poll();
            res.add(temp);
            for(int i:adj.get(temp))
            {
               if(!vis[i])
               {
                    vis[i]=true;
                q.add(i);
               }
            }
        }
    }
}
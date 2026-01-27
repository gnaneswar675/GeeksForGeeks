class Solution {
    public int countEdges(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int sum=0;
        for(int i=0;i<adj.size();i++)
        {
            sum+=adj.get(i).size();
        }
        return sum/2;
    }
}
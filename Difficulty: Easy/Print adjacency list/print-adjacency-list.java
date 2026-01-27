// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int v, int edges[][]) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<v;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            int a=edges[i][0];
            int b=edges[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        return graph;
    }
}
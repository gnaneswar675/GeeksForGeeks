class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int a[][]=new int[start.length][2];
        for(int i=0;i<start.length;i++){
            a[i][0]=start[i];
            a[i][1]=end[i];
        }
        Arrays.sort(a, (x, y) -> x[1] - y[1]);
        int res=1;
        int last=a[0][1];
        for(int i=1;i<a.length;i++){
            if(last<a[i][0]){
                res++;
                last=a[i][1];
            }
        }return res;
    }
}

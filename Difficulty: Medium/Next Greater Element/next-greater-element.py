class Solution:
    def nextLargerElement(self, arr):
        # code here
        n=len(arr)
        st=[]
        nge=[-1]*n
        for i in range(n-1,-1,-1):
            while st and st[-1] <=arr[i]:
                st.pop()
            if (st):
                nge[i]=st[-1]
            st.append(arr[i])
        return nge
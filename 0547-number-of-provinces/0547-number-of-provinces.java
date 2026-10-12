class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
for(int i=0;i<=isConnected.length;i++)
adj.add(new ArrayList<>());
        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected.length;j++)
            {
                if(isConnected[i][j]==1)
                {
                    adj.get(i+1).add(j+1);
                }

            }
        }
        boolean arr[]=new boolean[isConnected.length+1];
int count=0;
        for(int i=1;i<=isConnected.length;i++)
        {
            if(!arr[i])
            {
                dfs(i,arr,adj);
                count++;
            }

        }
        return count;
    }
    static void dfs(int i,boolean arr[],ArrayList<ArrayList<Integer>>adj)
    {
        arr[i]=true;
        for(int k:adj.get(i))
        {
            if(!arr[k])

            {
                arr[k]=true;
                dfs(k,arr,adj);
            }
        }
    }

}
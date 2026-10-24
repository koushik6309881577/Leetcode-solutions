class Solution {
    public int xorOperation(int n, int start) {
        int i=1;
        int ans=start;
        int sum=0;
        while(i<=n)
        {
            sum^=ans;
            ans+=2;
            
            i++;
        }
        return sum;
    }
}
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i=1;
        int j=0;
        List<String>s=new ArrayList<>();
        while( j<target.length && i<=n )
        {
            if(i==target[j])
            {
                s.add("Push");
                j++;
                i++;
                
            }
            else if(i!=target[j])
            {
                s.add("Push");
                s.add("Pop");
                i++;
            }
            
            



        }
        return s;
        
    }
}
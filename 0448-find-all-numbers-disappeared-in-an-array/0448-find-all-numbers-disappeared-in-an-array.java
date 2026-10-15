class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len=nums.length;
        HashSet<Integer>l=new HashSet<>();
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i:nums)
        l.add(i);
        int j=1;
        while(j<=len)
        {
            if(!l.contains(j))
            l1.add(j);
            j++;

        }
        return l1;
        
        
    }
}
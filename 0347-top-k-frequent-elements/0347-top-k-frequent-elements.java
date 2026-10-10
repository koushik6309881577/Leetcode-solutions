class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            
        }
        Integer arr[]=hm.keySet().toArray(new Integer[0]);
        Arrays.sort(arr,(a,b)->hm.get(b)-hm.get(a));
        int res[]=new int[k];
        for(int i=0;i<k;i++)
        res[i]=arr[i];
        return res;
        
    }
}
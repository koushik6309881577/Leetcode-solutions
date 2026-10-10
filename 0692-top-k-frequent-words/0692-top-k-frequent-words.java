class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        for(String i:words)
        hm.put(i,hm.getOrDefault(i,0)+1);
        String arr[]=hm.keySet().toArray(new String[0]);
        Arrays.sort(arr,(a,b)-> {if(hm.get(a).equals(hm.get(b)))
        return a.compareTo(b); return hm.get(b)-hm.get(a);});
        List<String>l=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            l.add(arr[i]);

        }
        return l;

    }
}
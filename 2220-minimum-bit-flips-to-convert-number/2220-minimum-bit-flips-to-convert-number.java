class Solution {
    public int minBitFlips(int start, int goal) {
        String s1=Integer.toBinaryString(start);
        String s2=Integer.toBinaryString(goal);
        while(s1.length()<s2.length())
        {
            s1="0"+s1;
        }
         while(s1.length()>s2.length())
        {
            s2="0"+s2;
        }
        int j=0;
        int c=0;
        while(j<s1.length())
        {
            if(s1.charAt(j)!=s2.charAt(j))
            c++;
            j++;
        }
        return c;
    }
}
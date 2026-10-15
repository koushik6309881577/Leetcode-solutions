class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
           if(func(words[i]))
           {
            return words[i];
           }
        }
        return "";
        
    }
    static boolean func(String ans)
    {
        int i=0;
        int j=ans.length()-1;
        while(i<j)
        {
            if(ans.charAt(i)!=ans.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}
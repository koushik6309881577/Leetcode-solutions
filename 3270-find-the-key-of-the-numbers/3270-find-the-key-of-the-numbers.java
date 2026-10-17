class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int n=(int)Math.log10(num1)+1;
        int n1=(int)Math.log10(num2)+1;
        int n2=(int)Math.log10(num3)+1;
        int max=Math.max(n,(Math.max(n1,n2)));
        String one=Integer.toString(num1);
        String two=Integer.toString(num2);
        String three=Integer.toString(num3);
        while(one.length()<max)
        {
            one="0"+one;
            
            
        }
         while(two.length()<max)
        {
            two="0"+two;
        
            
        }
        while(three.length()<max)
        {
            three="0"+three;
            
            
        }
        int l=0;
    
        String ans="";
        while(l<one.length())
        {
            ans+=Math.min((one.charAt(l)-'0'),Math.min(two.charAt(l)-'0',three.charAt(l)-'0'));
            l++;
        

        }
        
        
        return Integer.parseInt(ans);
        
        
    }
}
/*

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String a = String.format("%04d", num1);
        String b = String.format("%04d", num2);
        String c = String.format("%04d", num3);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int digit = Math.min(
                a.charAt(i) - '0',
                Math.min(b.charAt(i) - '0', c.charAt(i) - '0')
            );
            ans.append(digit);
        }

        return Integer.parseInt(ans.toString());
    }
}
}*/
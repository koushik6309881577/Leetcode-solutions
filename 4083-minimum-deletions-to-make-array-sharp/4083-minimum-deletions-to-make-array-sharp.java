class Solution {
    public int minDeletions(int[] nums) {
        Stack<Integer>s=new Stack<>();
        s.push(nums[0]);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==s.peek())
            {
            continue;
            }
            else
            s.push(nums[i]);
        }
        return nums.length-s.size();
        
    }
}
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int current=0;

        for(int i=0;i<nums.length;i++)
        {
            current = (current*2 + nums[i]) % 5;
            if(current == 0)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;
    }
}
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for(int i=0;i<nums.size();i++)
        {
            int x = nums.get(i);

            if(x==2)
            {
                ans[i]=-1;
                continue;
            }

            for(int j=0;j<32;j++)
            {
                if(((x>>j)&1)==0)
                {
                    ans[i] = x ^ (1<<(j-1));
                    break;
                }
            }
        }
        return ans;
    }
}
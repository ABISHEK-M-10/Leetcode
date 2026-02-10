class Solution {
    public int longestBalanced(int[] nums) {
        int length = 0;
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();

            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0)
                {
                    even.add(nums[j]);
                }
                else
                {
                    odd.add(nums[j]);
                }

                int diff = Math.abs(even.size()-odd.size());
                int rem = j-i+1;

                if(diff>rem)
                {
                    break;
                }

                if(even.size()==odd.size())
                {
                    length = Math.max(length,j-i+1);
                }
            }
        }
        return length;
    }
}
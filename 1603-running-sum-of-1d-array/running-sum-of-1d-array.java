class Solution {
    public int[] runningSum(int[] nums) {
        int total = 0;
        int[] ans = new int[nums.length];
        for(int i = 0;i < nums.length;i++)
        {
            total += nums[i];
        }
        ans[nums.length-1] = total;

        for(int i=nums.length-2;i>=0;i--)
        {
            total -= nums[i+1];
            ans[i] = total;
        }
        return ans;
    }
}
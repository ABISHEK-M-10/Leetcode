class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int left=0;

        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        }
        double ans=sum/k;

        for(int right=k;right<nums.length;right++)
        {
            sum+=nums[right];
            sum-=nums[left];

            ans = Math.max(ans,sum/k);
            left++;
        }
        return ans;
    }
}
class Solution {
    public int averageValue(int[] nums) {
        int div = 0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0 && nums[i]%2==0)
            {
                sum+=nums[i];
                div++;
            }
        }
        if(div==0)
        {
            return 0;
        }
        return sum/div;
    }
}
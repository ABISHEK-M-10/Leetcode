class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int max = 0;
        while(left<right)
        {
            int pair = nums[left]+nums[right];
            max = Math.max(pair,max);
            left++;
            right--;
        }
        return max;
    }
}
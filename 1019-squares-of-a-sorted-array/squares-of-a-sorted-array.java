class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;


        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        
        while(left<=right)
        {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];

            if(l>r)
            {
                ans[index] = l;
                left++;
                index--;
            }
            else
            {
                ans[index] = r;
                right--;
                index--;
            }
        }
        return ans;
        }
}
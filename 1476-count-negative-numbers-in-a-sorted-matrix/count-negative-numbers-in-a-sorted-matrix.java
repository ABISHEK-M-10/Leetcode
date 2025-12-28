class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] m: grid)
        {
            for(int n: m)
            {
                if(n<0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
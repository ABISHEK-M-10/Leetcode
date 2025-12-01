class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long sum = 0;
        for(int battery: batteries)
        {
            sum += battery;
        }
        int k = 0,l =  batteries.length;
        while(batteries[l - k -1] > sum/(n-k))
        {
            sum -= batteries[l - k - 1];
            k++;
        }
        return sum/(n-k);
    }
}
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long[] arr1 = new long[n+1];
        long[] arr2 = new long[n+1];


        for(int i=1;i<=n;i++)
        {
            int a = prices[i-1];
            int b = strategy[i-1];

            arr1[i] = arr1[i-1] + (a*b);
            arr2[i] = arr2[i-1] + a;
        }

        long ans = arr1[n];

        for(int i = k; i<=n;i++)
        {
            ans = Math.max(ans, arr1[n] - (arr1[i] - arr1[i-k]) + (arr2[i]-arr2[i-k/2]));
        }
        return ans;
    }
}
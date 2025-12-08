class Solution {
    public int countTriples(int n) {
        int ans = 0;

        for(int i=1;i<=n;i++)
        {
            for(int j = i+1;j<=n;j++)
            {
                int sqr = (i*i) + (j*j);
                int r = (int)Math.sqrt(sqr);
                if(r*r == sqr && r <= n)
                {
                    ans+=2;
                }
            }
        }
        return ans;
    }
}
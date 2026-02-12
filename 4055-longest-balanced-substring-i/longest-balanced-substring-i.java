class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;

        for(int i=0;i<n;i++)
        {
            int unique = 0;
            int maxfreq = 0;

            int[] freq = new int[26];
            for(int j=i;j<n;j++)
            {
                int ch = s.charAt(j)-'a';

                if(freq[ch] == 0)
                {
                    unique++;
                }
                freq[ch]++;

                maxfreq = Math.max(maxfreq,freq[ch]);

                int length = j-i+1;

                if(maxfreq * unique == length)
                {
                    ans = Math.max(ans,length);
                }
            }
        }
        return ans;
    }
}
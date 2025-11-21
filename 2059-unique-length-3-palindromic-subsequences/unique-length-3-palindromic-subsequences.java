class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans=0;

        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first,-1);

        for(int i=0;i<n;i++)
        {
            int c = s.charAt(i) - 'a';
            if(first[c] == -1)
            {
                first[c] = i;
            }
            last[c] = i;
        }

        for(int c=0;c<26;c++)
        {
            if(first[c]!=-1 && first[c]<last[c])
            {
                boolean[] set = new boolean[26];
                for(int i=first[c]+1;i<last[c];i++)
                {
                    set[s.charAt(i)-'a'] = true;
                }

                for(boolean x: set)
                {
                    if(x)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;

        
    }
}
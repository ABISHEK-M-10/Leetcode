class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[m+n];

        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                ans[k] = nums1[i];
                i++;
                k++;
            }
            else {
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(i<m)
        {
            for(int p=i;p<m;p++)
            {
                ans[k] = nums1[p];
                k++;
            }
        }
        if(j<n)
        {
            for(int p=j;p<n;p++)
            {
                ans[k] = nums2[p];
                k++;
            }
        }
        for(int p=0; p<m+n; p++)
        {
            nums1[p] = ans[p];
        }

    }
}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if (p.length() > s.length()) {
            return list;
        }

        int windowsize = p.length();

        for(int i=0;i<p.length();i++)
        {
            arr1[p.charAt(i)-'a']++;
        }

        for(int i=0;i<s.length();i++)
        {

            arr2[s.charAt(i)-'a']++;
            if(i >= windowsize)
            {
                arr2[s.charAt(i-windowsize)-'a']--;
            }

            if(Arrays.equals(arr1,arr2))
            {
                list.add(i-windowsize + 1);
            }
        }
        return list;


    }
}
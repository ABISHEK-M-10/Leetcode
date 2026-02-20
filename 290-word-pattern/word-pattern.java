class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");

        if(arr.length != pattern.length())
        {
            return false;
        }

        Map<Object, Integer> str = new HashMap<>();

        for(int i=0;i<pattern.length();i++)
        {
            if(!Objects.equals(str.put(pattern.charAt(i),i),str.put(arr[i],i)))
            {
                return false;
            }
        }
        return true;
    } 
}
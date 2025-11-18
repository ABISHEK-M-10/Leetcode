class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits.length==1 && bits[0]==0)
        {
            return true;
        }
        int i=0;
        while(i<bits.length)
        {
            if(bits[i]==1)
            {
                i+=2;
            }
            else
            {
                i+=1;
            }
            if(i==bits.length-1)
            {
                if(bits[i]==0)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
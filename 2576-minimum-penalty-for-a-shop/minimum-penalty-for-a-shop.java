class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;

        for(char ch: customers.toCharArray())
        {
            if(ch == 'Y')
            {
                penalty++;
            }
        }

        int minpenalty = penalty;

        int place = 0;

        for(int i=0;i<customers.length();i++)
        {
            if(customers.charAt(i)=='Y')
            {
                penalty--;
            }
            else
            {
                penalty++;
            }

            if(penalty < minpenalty)
            {
                minpenalty = penalty;
                place = i+1;
            }
        }
        return place;
    }
}
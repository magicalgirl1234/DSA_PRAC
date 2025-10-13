class Solution {
        private static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        
        long evenCount = (n+1)/2;
        long oddCount = n/2;

        long res = (power(5 , evenCount)*power(4,oddCount))%MOD;

        return (int)res; 

        
    }

    private long power(long base , long exp)
    {
        long res =1;
        base = base%MOD;
        while(exp >0)
        {
            if(exp%2==1)
            {
                res = (res*base)%MOD;
            }
            base = (base*base)%MOD;;
                exp/=2;
        }
        return res;

    }
}

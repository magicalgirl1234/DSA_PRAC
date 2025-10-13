class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum =0;

        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int num : nums)
            {
                mpp.put(num , mpp.getOrDefault(num , 0)+1);
            }

        for(int num : mpp.keySet())
            {
                int freq = mpp.get(num);
                if(freq % k ==0)
                {
                    sum+= freq * num;
                    
                }
            }
        return sum;

        
        
  

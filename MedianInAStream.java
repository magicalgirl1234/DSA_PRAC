class Solution {
    public ArrayList<Double> getMedian(int[] arr) {
        int n = arr.length;
        double median=0.0;
        
        ArrayList<Double> res = new ArrayList<>();
        
        PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>((a,b) -> b-a);
        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();
        
        for(int i =0; i< n ; i++)
        {
            leftMaxHeap.add(arr[i]);
            
            int temp = leftMaxHeap.poll();
            
            rightMinHeap.add(temp);
            
            if(rightMinHeap.size() > leftMaxHeap.size() )
            {
                int tempp = rightMinHeap.poll();
                leftMaxHeap.add(tempp);

                
            }
            
            if(leftMaxHeap.size()  != rightMinHeap.size() )
            {
                median = leftMaxHeap.peek();
                
            }
            else if(leftMaxHeap.size() == rightMinHeap.size())
            {
                median = (leftMaxHeap.peek() +  rightMinHeap.peek())/2.0;
            }
            
            
            res.add(median);
        }
        
        return res;
       
        
    }
}

class Solution {
    private List<Integer> arr;
    private int count;
    Solution()
    {
        arr = new ArrayList<>();
        count =0;
    }
    public void initializeHeap() {
        arr.clear();
        count=0;
    }

    public void insert(int key) {
        arr.add(key);

        heapifyUp(count);
        count++;
        return;
        
    }

    public void changeKey(int index, int newVal) {

        if(arr.get(index) < newVal)
        {
            arr.set(index , newVal);
            heapifyUp(index);
        }
        else
        {
            arr.set(index , newVal);
            heapifyDown(index);
        }
        return;
    }

    public void extractMax() {
        int ele = arr.get(0);
        int temp = arr.get(count-1);
        arr.set(count-1 , arr.get(0));
        arr.set(0 , temp);

        arr.remove(count-1);
        count--;
        if(count>0){
             heapifyDown(0);
        }
    }
    public boolean isEmpty() {
        return (count==0);
    }
    public int getMax() {
        return arr.get(0);
    }
    public int heapSize() {
        return count;
    }
    private void heapifyUp(int ind)
    {
        int parent = (ind - 1) / 2;
        if(ind > 0 && arr.get(ind) > arr.get(parent) )
        {
            int temp = arr.get(ind);
            arr.set(ind , arr.get(parent));
            arr.set(parent, temp);

            heapifyUp(parent);
        }
        return;
    }
    private void heapifyDown(int ind)
    {
        int n = arr.size();
        int largest = ind;
        int left_child = 2 * ind + 1;
        int right_child  = 2 * ind + 2;

        if(left_child < n && arr.get(left_child) > arr.get(largest))
        {
            largest = left_child;
        }

        if(right_child < n && arr.get(right_child) > arr.get(largest))
        {
            largest = right_child;
        }

        if(largest != ind )
        {
            int temp = arr.get(largest);
            arr.set(largest , arr.get(ind));
            arr.set(ind , temp);
            heapifyDown(largest);
        }
    }
}

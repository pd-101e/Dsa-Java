
//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();//default min hep
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());// max heap
        
        int n = r-l+1;
        
        for(int i = 0 ; i<n ; i++)
        {
            // pq.add(arr[i]);
            pq.offer(arr[i]);
            int size = pq.size();
            
            if(size > k )
            {
                // pq.poll();
                pq.remove();
            }
            
            
        }
        
        int ans = pq.peek();
        return ans ;
        
    
        
        // Collections.addAll(pq,arr);
        // pq.addAll(Arrays.asList(arr))
        
    } 
}

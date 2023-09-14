//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        Queue<Integer> pos = new LinkedList<Integer>();
        Queue<Integer> neg = new LinkedList<Integer>();
        
        for(int x : arr)
        {
            if(x > 0)
            {
                pos.add(x);
            }
            else{
                neg.add(x);
            }
        }
        
        int index = 0;
        while(!pos.isEmpty())
        arr[index++] = pos.poll();
        
        while(!neg.isEmpty())
        arr[index++] = neg.poll();
        
        
        
    }
}


//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
     Set<Integer>s = new HashSet<Integer>();
     
     for(int x : a)
     {
         s.add(x);
     }
     for(int x : b)
     {
         s.add(x);
     }
       
    int ans = s.size();
    return ans ;
        
    }
}

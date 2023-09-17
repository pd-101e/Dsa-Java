
/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */
/*
learned 
Integer.MAX_VALUE
Integer.MIN_VALUE
Math.min(first,second)


  */


class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        Pair ans = new Pair(Integer.MAX_VALUE,Integer.MIN_VALUE);
        
        for(int i = 0 ; i<n ; i++)
        {
            ans.first = Math.min(ans.first,a[i]);
            ans.second = Math.max(ans.second,a[i]);
        }
        
        return ans ;
        
    }
}

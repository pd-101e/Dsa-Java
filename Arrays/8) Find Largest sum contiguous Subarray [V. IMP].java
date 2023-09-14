
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max_so_far = arr[0];
        long res = arr[0];
        for(int i = 1 ; i<n ; i++)
        {
            max_so_far = Math.max(arr[i],max_so_far +arr[i]);
            res = Math.max(res,max_so_far);
        }
        
        return res;
        
    }
    
}

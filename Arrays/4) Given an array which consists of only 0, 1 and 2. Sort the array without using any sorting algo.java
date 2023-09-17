
class Solution
{
    
    public static void sort012(int arr[], int n)
    {
        // code here 
        int low = 0 ;
        int mid = 0;
        int high = n-1;
        while(mid <= high)
        {
            if(arr[mid] == 0)
            {
                swap(arr,low ,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
        
        
    }
    
    public static void swap(int arr[],int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}

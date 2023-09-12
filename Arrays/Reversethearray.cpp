// using string builder
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder reverse = new StringBuilder();
        
        int n = str.length();
        
        for(int i = n - 1 ; i >= 0 ; i--)
        {
            char temp = str.charAt(i);
            reverse.append(temp);
        }
    
        String ans = reverse.toString();
        return ans ;
        
    }
}

// using tochararray

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char arr[] = str.toCharArray();
        int low = 0 ;
        int high = arr.length - 1;
        char temp;
        while(low < high)
        {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        
        String ans = new String(arr);
        return ans;
    }
}
//using swap with toCharArray


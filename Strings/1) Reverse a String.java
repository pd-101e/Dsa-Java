
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        String ans = s.toString();
        return ans ;
        
        
    }
}

/////////////////////////////////////////////////////////////


//User function Template for Java


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

//*********************************************************************************8


//User function Template for Java


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

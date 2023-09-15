
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

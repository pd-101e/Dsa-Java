
//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder str = new StringBuilder(S);
        String str2 = new String(str.reverse());
        
        if(S.equals(str2))
        {
            return 1;
        }
        else{return 0;}
        
    }
};


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder str = new StringBuilder(S);
        StringBuilder str1 = new StringBuilder(S);
        StringBuilder str2 =new StringBuilder(str.reverse());
        
        if(str1.compareTo(str2)==0)
        {
            return 1;
        }
        else{return 0;}
        
    }
};


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder str = new StringBuilder(S);
        str.reverse();
        
        if(new StringBuilder(S).compareTo(str)==0)
        {
            return 1;
        }
        else{return 0;}
        
    }
};

//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        StringBuilder str = new StringBuilder(S);
        str.reverse();
        
        if(S.compareTo(str.toString())==0)
        {
            return 1;
        }
        else{return 0;}
        
    }
};

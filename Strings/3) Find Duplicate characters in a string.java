import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void printDups(String str)
    {
        Map<Character,Integer>m = new HashMap<>();
        int n = str.length();
        for(int i = 0 ; i<n ; i++)
        {
            if(m.containsKey(str.charAt(i)))
            {
                m.put(str.charAt(i),m.get(str.charAt(i)) + 1);
            }
            else {
                m.put(str.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> element : m.entrySet() )
        {
            if(element.getValue() > 1)
            {
                System.out.println(element.getKey() + " count = " +  element.getValue());
            }
        }

    }
    public static void main(String[] args) {
        String str = "test string";
        printDups(str);

    }
}

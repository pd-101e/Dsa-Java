package com.company;

import java.sql.SQLOutput;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator <Integer> it = list.listIterator();
        while(it.hasNext())
        {
            it.add(5);
            it.next();
        }
         it = list.listIterator();
        while (it.hasNext())
        {
            int x = (Integer)it.next();
            System.out.println(x);
        }

    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Object>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator <Object> it = list.listIterator();
        while(it.hasNext())
        {
            it.add(5);
            it.next();
        }
        it = list.listIterator();
        while (it.hasNext())
        {
            int x = (Integer)it.next();
            System.out.println(x);
        }

    }
}

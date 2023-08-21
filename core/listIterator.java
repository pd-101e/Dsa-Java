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

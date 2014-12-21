package com.arana.ds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Object obj = new Object();
        System.out.println( "Hello World!" );
        List myList = new SList();
        myList.insertFront(obj);
    }
}

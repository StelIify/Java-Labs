/*
 * Main
 *
 * JavaCollectionsFramework. List.
 *
 * Copyright Oleksandr Zorenko KNUTE
 *
 * Java Development
 * JavaCollectionsFramework. List.
 *
 * 1. Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
 * 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
 * 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 * 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 */

package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        LocalDateTime start = LocalDateTime.now();

        //Creating ArrayList with 100000 elements
        List<Integer> intArrayList = new ArrayList<>();

        for (int i = 0; i < 100000; i++)
        {
            intArrayList.add(i);
        }

        LocalDateTime finish = LocalDateTime.now();
        System.out.println("ArrayList with 100000 elements has been created for " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");

        start = LocalDateTime.now();

        //Inserting 1000 new elements to ArrayList on the beginning, middle and the end.
        for (int i = 0; i < 1000; i++)
        {
            intArrayList.add(0, i*3);
            intArrayList.add(intArrayList.size()/2, i*5);
            intArrayList.add(intArrayList.size(), i*7);
        }

        finish = LocalDateTime.now();
        System.out.println("Inserting 1000 new elements to ArrayList on the beginning, middle and the end took " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");

        start = LocalDateTime.now();

        //Changing 1000 elements in ArrayList from the beginning, middle and the end.
        ListIterator<Integer> arrayListIterator = intArrayList.listIterator();

        while (arrayListIterator.hasNext())
        {
            int x = (Integer)arrayListIterator.next();

            if (x < 1000)
            {
                arrayListIterator.set(666666);
            }
            else if (x > 50000 && x < 51000 )
            {
                arrayListIterator.set(555555);
            }
            else if (x > 99000)
            {
               arrayListIterator.set(999999);
            }
        }

        finish = LocalDateTime.now();
        System.out.println("Changing 1000 elements in ArrayList on the beginning, middle and the end took " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");

        start = LocalDateTime.now();

        //Deleting 1000 elements from the beginning, middle and the end of ArrayList.
        ListIterator<Integer> arrayListIterator2 = intArrayList.listIterator();
        while (arrayListIterator2.hasNext())
        {
            int x = (Integer)arrayListIterator2.next();

            if (x < 1000)
            {
                arrayListIterator2.remove();
            }
            else if (x > 50000 && x < 51000 )
            {
                arrayListIterator2.remove();
            }
            else if (x > 99000)
            {
                arrayListIterator2.remove();
            }
        }

        finish = LocalDateTime.now();
        System.out.println("Deleting 1000 elements from the beginning, middle and the end of ArrayList took " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");

        start = LocalDateTime.now();

        //Creating LinkedList with 100000 elements
        List<Integer> intLinkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++)
        {
            intLinkedList.add(i);
        }

        finish = LocalDateTime.now();
        System.out.println("LinkedList with 100000 elements has been created for " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");

        start = LocalDateTime.now();

        //Inserting 1000 new elements to LinkedList on the beginning, middle and the end.
        for (int i =0; i < 1000; i++)
        {
            intLinkedList.add(0, i);
            intLinkedList.add(intLinkedList.size()/2, i);
            intLinkedList.add(intLinkedList.size(), i);
        }

        finish = LocalDateTime.now();
        System.out.println("Inserting 1000 new elements to LinkedList on the beginning, middle and the end took " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");

        start = LocalDateTime.now();

        //Changing 1000 elements in LinkedList from the beginning, middle and the end.
        ListIterator<Integer> linkedListIterator = intLinkedList.listIterator();
        while (linkedListIterator.hasNext())
        {
            int x = (Integer)linkedListIterator.next();

            if (x < 1000)
            {
                linkedListIterator.set(888888);
            }
            else if (x > 50000 && x < 51000 )
            {
                linkedListIterator.set(777777);
            }
            else if (x > 99000)
            {
                linkedListIterator.set(444444);
            }
        }

        finish = LocalDateTime.now();
        System.out.println("Changing 1000 elements in LinkedList on the beginning, middle and the end took " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");

        start = LocalDateTime.now();

        //Deleting 1000 elements from the beginning, middle and the end of LinkedList
        ListIterator<Integer> linkedListIterator2 = intLinkedList.listIterator();
        while (linkedListIterator2.hasNext())
        {
            int x = (Integer)linkedListIterator2.next();

            if (x < 1000)
            {
                linkedListIterator2.remove();
            }
            else if (x > 50000 && x < 51000 )
            {
                linkedListIterator2.remove();
            }
            else if (x > 99000)
            {
                linkedListIterator2.remove();
            }
        }

        finish = LocalDateTime.now();
        System.out.println("Deleting 1000 elements from the beginning, middle and the end of LinkedList took " +
                ChronoUnit.MILLIS.between(start, finish) + " ms");
    }
}

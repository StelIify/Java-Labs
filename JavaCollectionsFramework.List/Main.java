/**
 * @author Oleksandr Zorenko KNUTE
 * @version 24.06.2020
 *
 * Classname Main
 *
 * Module 3. JavaCollectionsFramework. List.
 * 1.  Create ArrayList and LinkedList containing  100 000 Integer elements.
 *     Compare time intervals.
 * 2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones.
 *    Compare time intervals.
 * 3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 *    Compare time intervals.
 * 4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones.
 *    Compare time intervals.
 **/

package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {

    public static void main(String[] args)
    {
        LocalDateTime start = LocalDateTime.now();

        //Create Array List with 100000 elements
        List<Integer> elementsArray = new ArrayList<>();

        for (int i = 0; i< 100000; i++)
        {
            elementsArray.add(i);
        }

        LocalDateTime finishArray = LocalDateTime.now();

        //Create Linked List with 100000 elements
        List<Integer> elementsLinked = new LinkedList<>();

        for (int i = 0; i< 100000; i++)
        {
            elementsLinked.add(i);
        }

        LocalDateTime finishLinked = LocalDateTime.now();

        // execution time in milliseconds
        long arrayListExecution = ChronoUnit.MILLIS.between(start, finishArray);
        long linkedListExecution = ChronoUnit.MILLIS.between(finishArray, finishLinked);

        // print results
        System.out.println("It took " + arrayListExecution
                + " milliseconds to initialize ArrayList and "
                + linkedListExecution
                + " milliseconds to initialize LinkedList");

        System.out.println("The fastest result was for "
                + (arrayListExecution < linkedListExecution ? "ArayList" : "Linkedlist"));

        // Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones.
        System.out.println("-------------------------------------------------------------------");

        LocalDateTime timestamp0 = LocalDateTime.now();

        // insert 1000 elements at the beginning of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.add(0, i*3);
        }

        LocalDateTime timestamp1 = LocalDateTime.now();

        // insert 1000 elements in the middle of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.add(elementsArray.size() / 2, i*4);
        }

        LocalDateTime timestamp2 = LocalDateTime.now();

        // insert 1000 elements at the end of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.add(elementsArray.size(), 999);
        }

        LocalDateTime timestamp3 = LocalDateTime.now();

        long addingToArrayBeginning = ChronoUnit.MILLIS.between(timestamp0, timestamp1);
        long addingToArrayMiddle = ChronoUnit.MILLIS.between(timestamp1, timestamp2);
        long addingToArrayEnd = ChronoUnit.MILLIS.between(timestamp2, timestamp3);

        System.out.println("For ArrayList it takes: \n"
                + addingToArrayBeginning + " ms. to add elements at the beginning;\n"
                + addingToArrayMiddle + " ms. to add elements in the middle;\n"
                + addingToArrayEnd + " ms. to add elements at the end\n");


        System.out.println("-------------------------------------------------------------------");

        // start inserting elements to LinkedList
        LocalDateTime timestamp4 = LocalDateTime.now();

        // insert 1000 elements at the beginning of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.add(0, i*5);
        }

        LocalDateTime timestamp5 = LocalDateTime.now();

        // insert 1000 elements in the middle of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.add(elementsLinked.size() / 2, i*10);
        }

        LocalDateTime timestamp6 = LocalDateTime.now();

        // insert 1000 elements at the end of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.add(elementsLinked.size(), 888);
        }

        // timestamp for finish point after adding elements on the end
        LocalDateTime timestamp7 = LocalDateTime.now();

        long addingToLinkedBeginning = ChronoUnit.MILLIS.between(timestamp4, timestamp5);
        long addingToLinkedMiddle = ChronoUnit.MILLIS.between(timestamp5, timestamp6);
        long addingToLinkedEnd = ChronoUnit.MILLIS.between(timestamp6, timestamp7);

        System.out.println("For LinkedList it takes: \n"
                + addingToLinkedBeginning + " ms. to add elements at the beginning;\n"
                + addingToLinkedMiddle + " ms. to add elements in the middle;\n"
                + addingToLinkedEnd + " ms. to add elements at the end\n");

        //Update 1000 elements  from the  beginning, from  the middle  and from the end of ones.
        System.out.println("-------------------------------------------------------------------");

        // start updating elements in ArrayList
        LocalDateTime timestamp8 = LocalDateTime.now();

        // update 1000 elements at the beginning of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.set(0, 5555);
        }

        LocalDateTime timestamp9 = LocalDateTime.now();

        // update 1000 elements in the middle of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.set(elementsArray.size() / 2, 6666);
        }

        LocalDateTime timestamp10 = LocalDateTime.now();

        // update 1000 elements on the end of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.set(elementsArray.size()-1, 8888);
        }

        // timestamp for finish point after updating elements on the end
        LocalDateTime timestamp11 = LocalDateTime.now();

        long updatingArrayBeginning = ChronoUnit.MILLIS.between(timestamp8, timestamp9);
        long updatingArrayMiddle = ChronoUnit.MILLIS.between(timestamp9, timestamp10);
        long updatingArrayEnd = ChronoUnit.MILLIS.between(timestamp10, timestamp11);

        System.out.println("For ArrayList it takes: \n"
                + updatingArrayBeginning + " ms. to update elements at the beginning;\n"
                + updatingArrayMiddle + " ms. to update elements in the middle;\n"
                + updatingArrayEnd + " ms. to update elements at the end\n");

        System.out.println("-------------------------------------------------------------------");


        // start updating elements in LinkedList
        LocalDateTime timestamp12 = LocalDateTime.now();

        // updating 1000 elements at the beginning of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.add(0, 444);
        }

        LocalDateTime timestamp13 = LocalDateTime.now();

        // updating 1000 elements in the middle of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.add(elementsLinked.size() / 2, 555);
        }

        LocalDateTime timestamp14 = LocalDateTime.now();

        // updating 1000 elements at the end of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.add(elementsArray.size(), 666);
        }

        // timestamp for finish point after updating elements on the end
        LocalDateTime timestamp15 = LocalDateTime.now();

        long updatingLinkedBeginning = ChronoUnit.MILLIS.between(timestamp12, timestamp13);
        long updatingLinkedMiddle = ChronoUnit.MILLIS.between(timestamp13, timestamp14);
        long updatingLinkedEnd = ChronoUnit.MILLIS.between(timestamp14, timestamp15);

        System.out.println("For LinkedList it takes: \n"
                + updatingLinkedBeginning + " ms. to update elements at the beginning;\n"
                + updatingLinkedMiddle + " ms. to update elements in the middle;\n"
                + updatingLinkedEnd + " ms. to update elements at the end\n");

        //Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones.
        System.out.println("-------------------------------------------------------------------");

        // start deleting elements in ArrayList
        LocalDateTime timestamp16 = LocalDateTime.now();

        // delete 1000 elements on the beginning of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.remove(0);
        }

        LocalDateTime timestamp17 = LocalDateTime.now();

        // delete 1000 elements on the middle of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.remove(elementsArray.size() / 2);
        }

        LocalDateTime timestamp18 = LocalDateTime.now();

        // delete 1000 elements on the end of ArrayList
        for (int i = 0; i< 1000; i++)
        {
            elementsArray.remove(elementsArray.size() - 1);
        }

        // timestamp for finish point after deleting elements on the end
        LocalDateTime timestamp19 = LocalDateTime.now();

        long deletingArrayBeginning = ChronoUnit.MILLIS.between(timestamp16, timestamp17);
        long deletingArrayMiddle = ChronoUnit.MILLIS.between(timestamp17, timestamp18);
        long deletingArrayEnd = ChronoUnit.MILLIS.between(timestamp18, timestamp19);

        System.out.println("For ArrayList it takes: \n"
                + deletingArrayBeginning + " ms. to delete elements at the beginning;\n"
                + deletingArrayMiddle + " ms. to delete elements in the middle;\n"
                + deletingArrayEnd + " ms. to delete elements at the end\n");

        System.out.println("-------------------------------------------------------------------");

        // start deleting elements in LinkedList
        LocalDateTime timestamp20 = LocalDateTime.now();

        // delete 1000 elements on the beginning of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.remove(0);
        }

        LocalDateTime timestamp21 = LocalDateTime.now();

        // delete 1000 elements on the middle of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.remove(elementsLinked.size() / 2);
        }

        LocalDateTime timestamp22 = LocalDateTime.now();

        // delete 1000 elements on the end of LinkedList
        for (int i = 0; i< 1000; i++)
        {
            elementsLinked.remove(elementsArray.size() - 1);
        }

        // timestamp for finish point after deleting elements on the end
        LocalDateTime timestamp23 = LocalDateTime.now();

        long deletingLinkedBeginning = ChronoUnit.MILLIS.between(timestamp20, timestamp21);
        long deletingLinkedMiddle = ChronoUnit.MILLIS.between(timestamp21, timestamp22);
        long deletingLinkedEnd = ChronoUnit.MILLIS.between(timestamp22, timestamp23);

        System.out.println("For LinkedList it takes: \n"
                + deletingLinkedBeginning + " ms. to delete elements at the beginning;\n"
                + deletingLinkedMiddle + " ms. to delete elements in the middle;\n"
                + deletingLinkedEnd + " ms. to delete elements at the end\n");

    }
}

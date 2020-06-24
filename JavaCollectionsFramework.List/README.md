JavaCollectionsFramework. List.

1. Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.

Result:

It took 19 milliseconds to initialize ArrayList and 37 milliseconds to initialize LinkedList

The fastest result was for ArayList
---------------------------------------------------------------------------------------
For ArrayList it takes: 
39 ms. to add elements at the beginning;
13 ms. to add elements in the middle;
0 ms. to add elements at the end
---------------------------------------------------------------------------------------
For LinkedList it takes: 
1 ms. to add elements at the beginning;
221 ms. to add elements in the middle;
0 ms. to add elements at the end
---------------------------------------------------------------------------------------
For ArrayList it takes: 
5 ms. to update elements at the beginning;
70 ms. to update elements in the middle;
19 ms. to update elements at the end
---------------------------------------------------------------------------------------
For LinkedList it takes: 
0 ms. to update elements at the beginning;
246 ms. to update elements in the middle;
14 ms. to update elements at the end
---------------------------------------------------------------------------------------
For ArrayList it takes: 
61 ms. to delete elements at the beginning;
14 ms. to delete elements in the middle;
0 ms. to delete elements at the end
---------------------------------------------------------------------------------------
For LinkedList it takes: 
3 ms. to delete elements at the beginning;
250 ms. to delete elements in the middle;
12 ms. to delete elements at the end


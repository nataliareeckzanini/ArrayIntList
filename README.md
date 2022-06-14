Assignment 8: Chapter 15


This time you will also create your test methods like I did for you in Assignment 7.  Not too hard, you should be doing this anyways.  You will update the ArrayIntList.java   Download ArrayIntList.java with you methods below. You will also create an Assignment8.java file that tests your methods.  Make sure you have preconditions and postconditions(like the ones I gave you from Assignment 7 and also read precondition/postconditions section on p 945) for all your methods and well commented code.

Problem #1

Write a method called upToNowTotal that returns a new ArrayIntList that contains a running total of the original list. In other words, the i th value in the new list should store the sum of elements 0 through i of the original list. For example, if a variable list stores the following sequence of values:

[2, 3, 5, 4, 7, 15, 20, 7]

and the following call is made:

ArrayIntList list2 = list.upToNowTotal();

Then the variable list2 should store the following sequence of values:

[2, 5, 10, 14, 21, 36, 56, 63]

The original list should not be changed by the method. If the original list is empty, the result should be an empty list. The new list should have the same capacity as the original. Remember that there is a constructor for ArrayIntList that takes a capacity as a parameter:

// Constructs an empty list with the given capacity.

// Precondition: capacity >= 0

public ArrayIntList(int capacity)

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {

    private int[] elementData;

    private int size;

 

    // your code goes here

}

Problem #2)

 

Write a method isPairSorted that returns whether or not a list of integers is pairwise sorted (true if it is, false otherwise). A list is considered pair sorted if each successive pair of numbers is in sorted (non-decreasing) order. For example, if a variable called list stores the following sequence of values:

[3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42]
Then the call of list.isPairSorted() should return true because the successive pairs of this list are all sorted: (3, 8), (2, 5), (19, 24), (-3, 0), (4, 4), (8, 205). Notice that the extra value 42 at the end had no effect on the result because it is not part of a pair. If the list had instead stored the following:

[1, 9, 3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4]
Then the method should return false because the pair (19, 17) is not in sorted order. If a list is so short that it has no pairs, then it is considered to be pair sorted. If a list is of odd length, the final element should be ignored since it has no pair. In other words, if the rest of the list is pair sorted until that last unpaired element, your method should return true.

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;
 
    // your code goes here
}
 

Problem #3)

Write a method removeLast that takes an integer n as a parameter and that removes the last n values from a list of integers. For example, if a variable called list stores this sequence of values:

[8, 17, 9, 24, 42, 3, 8]
and the following call is made:

list.removeLast(4);
It should store the following after the call:

[8,17,9]
Notice that the last four values in the list have been removed and the other values appear in the same order as in the original list. You may assume that the parameter value passed is between 0 and the size of the list inclusive.

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;
 
    // your code goes here
}
 

Problem #4)

You choose any other problem from the Exercises in Chapter 15 (p970-972 in book)

Deliverables: Submit your updated ArrayIntList.java file with your three new methods above added. 2) Assignment8.java that you will create to test your methods 3) QA Document showing screenshots of your working methods as tested by your Assignment8.java test methods. 

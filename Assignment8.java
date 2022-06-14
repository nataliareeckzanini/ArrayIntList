// Student: Natalia Reeck Zanini
// Course: CS 211
// Assignment #8
// May, 27th 2022


// This file contains the code required to test the methods:
// -upToNowTotal
// -isPairSorted
// -removeLast
// -printInversions (My choice from Chapter #15)

public class Assignment8{

	public static void main(String[] args) {
		
		System.out.println("Testing Methods:");
		System.out.println();

		int arr[] = {2,3,5,4,7, 15,20, 7};

		ArrayIntList list = new ArrayIntList(arr);

		ArrayIntList list2 = list.upToNowTotal();
		
		System.out.println("Output for the upToNowTotal method:");
		System.out.println(list2);
		System.out.println();
		

		int arr1[] = {3, 8, 2, 5, 19,24, -3, 0, 4,4, 8, 205, 42};

		ArrayIntList list3 = new ArrayIntList(arr1);

		System.out.println("Output for the isPairSorted method:");
		System.out.println(list3.isPairSorted());
		System.out.println();

		int arr2[] = {1,9,3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4};

		ArrayIntList list4 = new ArrayIntList(arr2);

		System.out.println("Second output for the upToNowTotal method:");
		System.out.println(list4.isPairSorted());
		System.out.println();

		int arr3[] = {8,17, 9,24,42,-3,8};

		ArrayIntList list5 = new ArrayIntList(arr3);

		list5.removeLast(4);
		
		System.out.println("Output for the removeLast method:");
		System.out.println(list5);
		System.out.println();
		
		int arr4[] = {4, 3, 2, 1};

		ArrayIntList list6 = new ArrayIntList(arr4);
		
		System.out.println("Output for the printInversions method:");
		list6.printInversions();
		
		

	}
}



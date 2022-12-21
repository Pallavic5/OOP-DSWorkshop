package com.bridgelabz.workshops;
/*
 * Problem Statement:
 * Logic of ability to search an element.
 * 
 */
import java.util.Scanner;

public class SearchElementDemo {
	public void searchElement() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int lengthOfArray = scanner.nextInt();
		int[] array = new int[lengthOfArray];
		System.out.println("Enter the values of Array: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Print the values of array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
			//Here Linear Search Method used for search an element.
		System.out.println("\nEnter the element you want to search.");
		int searchElement = scanner.nextInt();
		int flag = 0;
		//for loop for traversing array
		for (int i = 0; i < array.length; i++) {
			/*
			 * condition for compare searching element is equal or not with array element
			 */
			if (searchElement == array[i]) {
				System.out.println("Element found at position: " + i);
				flag = 1;			//if element found then flag is increement.
				break;
			}
		}
		//if flag is not increement then element not found.
		if (flag == 0) {
			System.out.println("Match not found");
		} else {
			System.out.println("Element found ");
		}

		scanner.close();
	}

			//main method
	public static void main(String[] args) {
		//instantiate class object
		SearchElementDemo demo = new SearchElementDemo();
		/*
		 * calling method
		 */
		demo.searchElement();
	}
}

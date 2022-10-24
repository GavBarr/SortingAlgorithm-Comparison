package a04mystery;

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import csis.Mystery;


/**
 * 
 * @author Gavin Barrett
 *
 */
public class A04
{
	


/**
 * main method
 * @param args
 */
	public static void main(String[] args)
	{

		Integer[] numbers = new Integer[5000];
	
		randNum(numbers);
		
		
		//sort1 method INSERTION SORT
		 long start = System.nanoTime();
		 Mystery.sort1(numbers);	
		 System.out.println("Sort1");
		 printArray(numbers);
		 long end = System.nanoTime();
		 
		 long elapsedTime = end - start;
		 double elapsedTimeInSecond = (double) elapsedTime / 1000000000;
		 System.out.print("Time: ");
		 System.out.printf("%.9f", elapsedTimeInSecond);
		 System.out.println(" ");
		 
		 
		 
		 
		 //sort2 method SELECTION SORT
		 System.out.println(" ");
		 long start2 = System.nanoTime();
		 Mystery.sort2(numbers);
		 System.out.println("Sort2");
		 printArray(numbers);
		 long end2 = System.nanoTime();
		 
		 long elapsedTime2 = end2 - start2;
		 double elapsedTimeInSecond2 = (double) elapsedTime2 / 1000000000;
		 System.out.print("Time: ");
		 System.out.printf("%.9f", elapsedTimeInSecond2);
		 System.out.println(" ");
		 
		 
		 
		//sort3 method QUICKSORT GUESS
		 System.out.println(" ");
		 long start3 = System.nanoTime();
		 System.out.println(" ");
		 Mystery.sort3(numbers);
		 System.out.println("Sort3");
		 printArray(numbers);
		 long end3 = System.nanoTime();
		 
		 long elapsedTime3 = end3 - start3;
		 double elapsedTimeInSecond3 = (double) elapsedTime3 / 1000000000;
		 System.out.print("Time: ");
		 System.out.printf("%.9f", elapsedTimeInSecond3);
		 System.out.println(" ");
		 
		 
		 
		 
		//sort4 method MERGESORT GUESS 
		 System.out.println(" ");
		 long start4 = System.nanoTime();
		 System.out.println(" ");
		 Mystery.sort4(numbers);
		 System.out.println("Sort4");
		 printArray(numbers);
		 long end4 = System.nanoTime();
		 
		 long elapsedTime4 = end4 - start4;
		 double elapsedTimeInSecond4 = (double) elapsedTime4 / 1000000000;
		 System.out.print("Time: ");
		 System.out.printf("%.9f", elapsedTimeInSecond4);
		 System.out.println(" ");
		 
		

	}
	
	/**
	 * method to get random numbers for the array
	 * @param numbers
	 * @return
	 */
	private static Integer[] randNum(Integer[] numbers) 
	{
		Random rd = new Random();
		
		for  (int i = 0; i < numbers.length; i++) 
		{
			 numbers[i] = rd.nextInt(100);
			
						
		}
		return numbers;		
		 
		 
	}

	/**
	 * method for each loop to output the array elements
	 * @param a
	 */
	public static void printArray(Integer[] a)
	{
		
		for(Integer el: a)
		{
			System.out.print(el + ", ");
		}
		
		System.out.println(" ");

	}
	
}
	
	

	

	
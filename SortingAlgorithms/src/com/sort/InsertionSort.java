package com.sort;

/*
 *  Pick the element and insert it into its appropriate position to the left
 *  and shift other numbers to the right.
 * 
 * Complexity = O(n^2) , considered better than bubble and selection sort.
 * 
 */

public class InsertionSort {

	public static void main(String[] args) 
	{
		int[] arr = {54,23,6,12,86,34,1};
		insertionsort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

	public static void insertionsort(int[] arr1)
	{
		for(int i=1;i<arr1.length;i++)
		{
			 int temp = arr1[i];
			 int pos = i;
			 while(temp<arr1[pos-1])
			 {
				 arr1[pos]=arr1[pos-1];
				 pos--;
				 
				 if(pos<=0)
					 break;
				 
			 }
			 arr1[pos]=temp;
		}
		
		
	}
	
	
}

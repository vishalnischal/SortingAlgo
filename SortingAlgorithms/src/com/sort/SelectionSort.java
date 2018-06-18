package com.sort;
/*
 *  Find the smallest element and move it to the left
 *  Complexity = O(n^2)
 * 
 */
public class SelectionSort {

	
	public static void main(String[] args) 
	{
		int[] arr = {37,23,18,9,88,43,25,67};  
		selectionsort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	public static void selectionsort(int[] arr1)
	{
		for(int i=0;i<arr1.length-1;i++)
		{
			int iMin = i;
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[j]<arr1[iMin])
				{
					iMin=j;
				}
				
			}
			int temp=arr1[i];
			arr1[i]=arr1[iMin];
			arr1[iMin]=temp;
		}
	}
	

}

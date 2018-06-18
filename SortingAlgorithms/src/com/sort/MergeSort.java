package com.sort;

import java.util.Arrays;

/*
 *  Merge two separate arrays , works on divide and conquer
 *  Complexity = O(n log n)
 * 
 * 
 */

public class MergeSort {


	public static void main(String[] args) 
	{
		int[] arr = {9,2,6,5,3,10,1,7};
		mergesort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
	
	
	public static int[] mergesort(int[] arr1)
	{
		int [] arrL = null;
		int [] arrR = null;
		
		if(arr1.length<=1)
		{
		 return arr1;
		}
		
		 if(arr1.length%2==0 && arr1.length>1)
		{
			arrL = Arrays.copyOf(arr1, arr1.length/2);
			arrR = Arrays.copyOfRange(arr1, arr1.length/2, arr1.length);
		}
		 if (arr1.length%2!=0 && arr1.length>1)
		{
			arrL = Arrays.copyOf(arr1, arr1.length/2);
		    arrR = Arrays.copyOfRange(arr1, arr1.length/2, arr1.length);
			
		}
		mergesort(arrL);
		mergesort(arrR);
		
		int i=0;
		int j=0;
		int k=0;
		
		
		while(i<arrL.length && j< arrR.length)
		{
			if(arrL[i]<= arrR[j])
			{
				
				arr1[k]=arrL[i];
				i++;
				k++;
				arr1[k]=arrR[j];
				
			}
			else if (arrL[i]>arrR[j])
			{
				arr1[k]=arrR[j];
				j++;
				k++;
				arr1[k]=arrL[i];
			}
			
			
		}
		
		 return arr1;
		
	}
	

}

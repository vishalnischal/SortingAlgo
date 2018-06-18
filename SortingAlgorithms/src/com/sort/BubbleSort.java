package com.sort;

/*
 *  Adjacent elements are compared and swapped
 *  Complexity = O(n^2)
 * 
 */

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {37,23,18,9,88,43,25,67};
	//	int[] arr = {1,2,3,4,5,6,25,67};
		bubblesort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void bubblesort(int []arr1)
	{
		
		for(int i=0;i<arr1.length-1;i++)
	   	{
			boolean flag = false;
			System.out.println("Outer Loop Start>>>>>>>");
			for(int j=0;j<arr1.length-j-1;j++)
			{
				System.out.println("Inner Loop Start >> ");
				if(arr1[j]>arr1[j+1])
				{
					System.out.println("Swapped Numbers are "+arr1[j]+" "+arr1[j+1]);
					int temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					flag = true;
				}
				System.out.println("Inner Loop End >> ");
				
			}
			System.out.println("Outer Loop End>>>>>>>");
			if(!flag)
				break;
		}
		
	}
	

}

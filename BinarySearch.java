package com.hema.array;

// 0(n/2)+c time complexity
//O(1) space complexity
public class BinarySearch {
	public static void main(String args[])
	{
		int d=45;
		int a[]= {1,2,4,10,20,40};
		if(search(a,d)==1)
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not available");
		}
	}
	public static int search(int[] a,int d)
	{
		int start=0,end=a.length,mid;
		int result=-1;
		while(start<end)
		{
			mid=(start+end)/2;
			if(a[mid]>d)
			{
				end=mid-1;
			}
			else if(a[mid]<d)
			{
				start=mid+1;
			}
			else if(a[mid]==d)
			{
				result= 1;
				break;
			}
			
		}
		return result;
	}
}

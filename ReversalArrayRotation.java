package com.hema.array;

public class ReversalArrayRotation {
public static void main(String args[])
{
int d=8;
int arr[]= {1,2,3,4,5,6,7};
arrRotate(arr,d,arr.length);
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
}
public static void arrRotate(int arr[],int d,int len)
{
	d=d%len; // if d>len
swap(arr,0,d-1);
swap(arr,d,len-1);
swap(arr,0,len-1);
}
public static void swap(int arr[],int startindex,int endindex)
{ 
	int temp=0;
	while(startindex<endindex)
	{
		temp=arr[startindex];
		arr[startindex]=arr[endindex];
		arr[endindex]=temp;
		startindex++;
		endindex--;
	}
}
}
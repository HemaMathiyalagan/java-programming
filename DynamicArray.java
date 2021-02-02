package com.hema.array;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T> {
	T[] arr;
	int len=0;
	int capacity=0;
	public DynamicArray() {
		arr=(T[]) new Object[16];
	}
	public DynamicArray(int capacity)
	{
		if(capacity<0)
			throw new IllegalArgumentException("Illegal capacity "+capacity);
		else
			arr =(T[]) new Object[capacity];
	}
	public T get(int i)
	{
		return arr[i];
	}
	public void clear()
	{
		for(int i=0;i<len;i++)
			arr[i]=null;
		len=0;
	}
	public int size()
	{
		return len;
		}
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void removeAt(int rm_index)
	{
		T[] new_arr=(T[]) new Object[len];
		if(rm_index>=len || rm_index<0)
		{
			 throw new IndexOutOfBoundsException();
		}
		for(int i=0,j=0;i<len;i++,j++)
		{
			if(i==rm_index)
			{
				j--;
			}
			else {
			new_arr[j]=arr[i];
			}
		}
		arr=new_arr;
		capacity=--len;
		
	}
	public boolean remove(T a)
	{
		int index=indexOf(a);
		
			if(index==-1)
			{
				return false;
			}
			else
			{
				removeAt(index);
				return true;
			}
		
	}
	public void set(T a,int i)
	{
		arr[i]=a;
	}
	public void add(T a)
	{
		if(len+1>capacity)
		{
		if(capacity==0)
			capacity=1;
		else capacity*=capacity;
		T[] new_arr=(T[]) new Object[capacity];
		arr=new_arr;
		}
		arr[len++]=a;
	}
	public int indexOf(T a)
	{
		for(int i=0;i<len;i++)
		{
			if(arr[i].equals(a))
				return i;
		}
		return -1;
	}
@Override
public Iterator<T> iterator() {
	return new java.util.Iterator<T>() {
		int index=0;
		@Override
		public boolean hasNext() {
			return index<len;
		}

		@Override
		public T next() {
			return arr[index++];
		}
		
	}
	;
}
}

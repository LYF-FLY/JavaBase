import java.util.*;
class MyArrayList<E> 
{
	private Object[] array;

	public MyArrayList()
	{
		array=new Object[0];
	}

	public int size()
	{
		return this.array.length;
	}
	public void add(E ele)
	{
	   Object copy = Arrays.copyOf(array,size()+1);
	   copy[size()]=ele;
	   array=copy;
	}

	public void remove(int index)
	{
		System.arraycopy(array,index+1,array,index,size()-index-1);
		array = Arrays.copyOf(array,size()-1);
	}

	public void clear()
	{
		array=new Object[0];
	}

	public E remove(E ele)
	{
		int index = indexOf(ele);
		remove(index);
		return ele;
	}

	public int indexOf(E ele)
	{
		for(int i=0;i<array.length;i++)
		{
			if(ele.equals(array[i])){
				return i;
			}
		}
		return -1;
	}

	public void set(int index,E ele)
	{
		this.array[index]=ele;
	}

	public E get(int index){

		return (E)this.array[index];
	}

	public void sort()
	{
		
	}
}


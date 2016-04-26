import java.util.HashMap;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<v> {

	public int size =0;
	public static int capacity=16;
	
	public v[] arr; 

	public ArrayList(){arr=(v[])new Object[capacity];}
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity){
		this.capacity=capacity;
		arr=(v[])new Object[capacity];
	}
	
	public void add(v value)
	{
		if(size==capacity) resize();
		size++;
		arr[size]=value;
	}
	
	@SuppressWarnings("unchecked")
	public void resize(){
		
		 capacity=capacity*2;
		v[] newArr=arr;
		arr=(v[])new Object[capacity];
		for(int i=0;i<newArr.length;i++)
		{
			arr[i]=newArr[i];
		}
	}
	
	public v remove(int index)
	{
		if (index<0||index>capacity) return null;
		v res=arr[index];
		for(int i=index;i<=size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		--size;
		return res;
	}
	
	public static void main(String[] args)
	{
		
	}
	
	
	
}

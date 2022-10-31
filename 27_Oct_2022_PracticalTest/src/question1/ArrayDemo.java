package question1;

import java.util.Arrays;

public class ArrayDemo {
	public void ManipulateIntegerArray()
	{
		Integer arr[]= {90,89,78,67,56};
		Integer arr1[] = new Integer[5];
		
		
		System.out.println("Old Array" +Arrays.toString(arr));

		for(int i=0,j=0;i<arr.length;i++,j++)
		{
		//System.out.println("Integer Array:"+arr[i]);
		
		
			arr1[j]= arr[i]+5;
			
			//System.out.println("New Array:"+arr1[j].toString());

		}
		
		
		System.out.println("New Array" +Arrays.toString(arr1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayDemo A1=new ArrayDemo();
 A1.ManipulateIntegerArray();
	}

}

package arraylist;

import java.util.Arrays;

public class MultiplyElementsof2Arrays 
{
	public static void main(String[] args)
	{	
		// take a default string array you wants.
		String result = "";
		int[] left_array = {2, -5, 4, -2};
		int[] right_array = {6, 4, -5, -2};

		// print both the string array first.
		System.out.print("\nArray1: "+Arrays.toString(left_array));  
		System.out.println("\nArray2: "+Arrays.toString(right_array)); 
		for (int i = 0; i < left_array.length; i++) 
		{
			int num1 = left_array[i];
			int num2 = right_array[i];

			// this will calculate the product of the string array.
			result += Integer.toString(num1 * num2) + " "; 
		}
		// print the result.
		System.out.println("\nResult: "+result);     
	}		
}
package FindKthSmallestNumber;

import java.util.Arrays;
import java.util.Random;

public class KthSmallestNumber {

	public static void main(String [] args){

		int [] array = {1,2,7,4,6,10,11};
		System.out.println(ksmallest(array, 0, array.length-1, 3));
		

	}


	public static int ksmallest(int [] array, int start, int end, int k){
		
		int r = partition(array, start, end);
		int n = r - start + 1;
		if(k == n)
			return array[r];
		
		if(k < n)
			return ksmallest(array, start, r-1, k);//recurse over the left side of the array
		else
			return ksmallest(array, r+1, end, k-n); //recurse over the right side of the array

	}

	public static int partition(int [] array, int start, int end){
		int i = start;
		int pivot = array[start];
		for(int j = i+1; j <= end; j++){
			if(array[j] <= pivot){
				i++;
				swap(array, i, j);
			}
		}
		swap(array,start, i);
		return i;
	}

	public static void swap(int [] array, int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}
}

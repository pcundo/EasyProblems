package EasyProblems;

import java.util.Arrays;

public class FindIntersectionOfTwoSortedArray {
	
	public static void main(String [] args){
		
		int [] array_a = { 3, 4, 5, 1, 3, 9,};
		int [] array_b = { 10, 33, 11, 8, 5};
		
		System.out.println(findIntersection(array_a, array_b));
		}
	
	
	/**
	 * This algorithm takes O(nlogn)
	 * Sort the array using Quicksort takes nlog(n).
	 * For each element in arrays_a, we use binary search to find the element in array_b, so
	 * that takes another log(n) for each element.
	 * 
	 * Note: To use java binary search, the array must be sorted first.
	 * 		 And java binary search will return the index of the element in that binary tree.
	 * @param array_a
	 * @param array_b
	 * @return the intersection element or -1 if the element not found.
	 */
	public static int findIntersection(int [] array_a, int [] array_b){
		
		int aLength = array_a.length;
		Arrays.sort(array_b);
		for(int i = 0; i < aLength; i++){
			if(Arrays.binarySearch(array_b, array_a[i]) >= 0)
				return array_a[i];
		}
		
		return -1;
	}
}

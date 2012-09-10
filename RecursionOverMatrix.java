package RecursionOverMatrix;

public class RecursionOverMatrix {

	public static void main(String [] args){
		String [][] matrix = {{"a", "b", "c", "d"},
							  {"e", "f", "g", "h"},
							  {"i", "j", "k", "l"},
							  {"m", "n", "o", "p"}};
		//preOrderTraversal(matrix, 0, 0);
		char [] array = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(arrayToString(array, 0));
		
		int [][] matrix_int = {{1,2,3}, {1,2,3}, {1,2,3}};
		System.out.println(sumMatrix(matrix_int, 0, 0, 0));
		
		System.out.println(findString(matrix, "efghlpq"));
		
		
	}
	
	public static int sumMatrix(int [][] matrix, int sum, int i, int j){
		if(i >= matrix.length)
			return sum;
		if(j >= matrix[0].length )
			return sumMatrix(matrix, sum,i+1, 0);
		return sumMatrix(matrix, sum + matrix[i][j], i, j+1);
		
	}
	
	public static String arrayToString(char [] array, int i){
		if(i > array.length-1) return "";
		return array[i] + arrayToString(array, i+1);
	}
	
	public static void preOrderTraversal(String [][] matrix, int i, int j){
		if( i > matrix.length-1 || j > matrix[0].length-1) 
			return;
		System.out.print(matrix[i][j] + " ");
		preOrderTraversal(matrix, i+1, j);
		preOrderTraversal(matrix, i, j+1);
		
	}
	
	public static boolean findString(String [][] matrix, String str){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length;j++){
				if(findString(matrix, str, i,j))
					return true;
			}
		}
		return false;
	}
	
	//This is depth first search. Only work for right and down character
	public static boolean findString(String [][] matrix, String str, int i, int j){
		
		if(str.length() == 0)
			return true;
		
		if(i >= matrix.length || j > matrix[0].length)
			return false;
		
		return matrix[i][j].equals(str.charAt(0)+"")&&(findString(matrix, str.substring(1), i+1, j)
				|| findString(matrix, str.substring(1), i, j+1));
		
	}
}

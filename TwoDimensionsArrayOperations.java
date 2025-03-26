package DSAPrep;

public class TwoDimensionsArrayOperations {
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//1.Basic Traversal
		System.out.println("1. Basic Traversal:  ");
		traversal2DArrays(matrix);
		
		//2. Element Access
		System.out.println("\n2. Element Access: ");
		accessElement(matrix,1,2);//access element at row 1, column 2
		
		
	}

	 // 2. Element Access: Retrieves and prints the element at the specified row and column.
    public static void accessElement(int[][] arr, int row, int col) {
        if (row >= 0 && row < arr.length && col >= 0 && col < arr[row].length) {
            System.out.println("Element at [" + row + "][" + col + "] is: " + arr[row][col]);
        } else {
            System.out.println("Invalid row or column indices.");
        }
    }

	private static void traversal2DArrays(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

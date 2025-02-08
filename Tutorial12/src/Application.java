
public class Application {
	public static void main(String[] args) {
		
		int values[] = {3, 4, 5455};
		System.out.println(values[2]);
		
		int[][] grid = {
				{1,2,3,4,5},
				{6,7,8,9},
				{11,12,33}
		};
		
		System.out.println(grid[0][1]);
		System.out.println(grid[0][2]);
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) System.out.print(grid[row][col] + "\t");
			System.out.println();
		}
		
	}
}

package postAP;

public class TwoDArrays {
	public static void main(String[] args) {
		boolean[][] name = new boolean[3][3];
		printGrid(name);
		fillGrid(name);
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		printGrid(name);
		System.out.println(gridTesting(name));
	}

	public static int gridTesting(boolean[][] grid) {
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j]) {
					count++;
				}
			}
		}

		return count;
	}

	public static void fillGrid(boolean[][] grid) {
		double rand;
		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {
				rand = Math.random();
				grid[i][j] = rand > 0.65;
			}
		}
	}

	public static void printGrid(boolean[][] grid) {
		for (boolean[] row : grid) {
			String rowValues = "";
			for (boolean value : row) {
				rowValues = rowValues + value + "\t";
			}
			System.out.println(rowValues);
		}
	}
}

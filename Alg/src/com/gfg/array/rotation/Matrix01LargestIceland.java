package com.gfg.array.rotation;

public class Matrix01LargestIceland {
	// Driver method
	public static void main (String[] args) throws java.lang.Exception
	{
		int M[][]=  new int[][] {{1, 1, 0, 0, 0},
			                     {0, 1, 0, 0, 1},
			                     {1, 1, 1, 1, 1},
			                     {0, 0, 0, 0, 0},
			                     {1, 0, 1, 0, 1}
		};
		Matrix01LargestIceland I = new Matrix01LargestIceland();
		System.out.println("Number of islands is: "+ I.maxAreaOfIsland(M));
	}
	public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, getMaxArea(grid, i, j));
                }
            }
        }
        return maxArea;
    }
private int getMaxArea(int[][] grid, int row, int col){
        if(row < 0 || row > grid.length-1 || col < 0 || col > grid[0].length-1 || grid[row][col] != 1){
            return 0;
        }
        grid[row][col] = -1;
        return 1 + getMaxArea(grid, row+1, col) + getMaxArea(grid, row-1, col) + getMaxArea(grid, row, col+1) + getMaxArea(grid, row, col-1);
    }


}

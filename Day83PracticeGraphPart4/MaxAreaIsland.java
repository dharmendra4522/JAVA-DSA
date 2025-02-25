package Day83PracticeGraphPart4;

public class MaxAreaIsland {
    public int findArea(int row, int col, int[][] grid) {
        // Boundary check and check if the cell is water (0)
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }

        // Mark the cell as visited by converting it to water (0)
        grid[row][col] = 0;

        // Current cell contributes 1 to the area
        int currArea = 1;

        // Explore all four directions
        currArea += findArea(row + 1, col, grid);
        currArea += findArea(row - 1, col, grid);
        currArea += findArea(row, col + 1, grid);
        currArea += findArea(row, col - 1, grid);

        return currArea;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        // Iterate through each cell in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // If the cell is land (1), calculate the area of the island
                if (grid[i][j] == 1) {
                    int currArea = findArea(i, j, grid);
                    // Update the maximum area
                    maxArea = Math.max(maxArea, currArea);
                }
            }
        }

        return maxArea;
    }
}

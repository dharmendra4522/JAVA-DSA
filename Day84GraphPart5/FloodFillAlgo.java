package Day84GraphPart5;

public class FloodFillAlgo {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgCol) {
        // Base conditions
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }

        // Mark the cell as visited and update its color
        vis[sr][sc] = true;
        image[sr][sc] = color;

        // Recursive calls for adjacent cells
        // Left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // Right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // Up
        helper(image, sr - 1, sc, color, vis, orgCol);
        // Down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public static void main(String[] args) {
        FloodFillAlgo floodFillAlgo = new FloodFillAlgo();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;

        int[][] result = floodFillAlgo.floodFill(image, sr, sc, newColor);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}

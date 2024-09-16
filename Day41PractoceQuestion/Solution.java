public class Solution {
    public static void printSolution(int sol[][]) {
    for (int i = 0; i<sol.length; i++) {
    for (int j = 0; j<sol.length; j++) {
    System.out.print(" " + sol[i][j] + " ");
    }
    System.out.println();
    }
    }
    public static boolean isSafe(int maze[][], int x, int y) {
    // if (x, y outside maze) return false
    return (x >= 0 && x < maze.length
    && y >= 0 && y < maze.length && maze[x][y] == 1);
    }
    public static boolean solveMaze(int maze[][]) {
    int N = maze.length;
    int sol[][] = new int[N][N];
    if (solveMazeUtil(maze, 0, 0, sol) == false) {
    System.out.print("Solution doesn't exist");
    return false;
    }
    printSolution(sol);
    return true;
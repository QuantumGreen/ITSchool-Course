package session5_advanced_flow_controll.challanges;

import java.util.*;

// 13. Pathfinding in a Maze
//Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start, and an end. You have to find a path from the start to the end, moving only up, down, left, or right. You can't move diagonally. If a path exists, print it; otherwise, inform the user that there's no solution.
//
//The maze will be represented by a 2D array where:
//0 represents an open cell.
//1 represents a wall.
//S represents the start.
//E represents the end.
//
//Example:
//S 1 0 1
//0 1 0 1
//0 1 0 1
//1 0 0 E
//
//Problem Tasks:
//Read the maze layout from a file or hard-code it into your program.
//Implement a pathfinding algorithm to navigate from the start to the end.
//If a path is found, print the maze with the path. You can represent the path with a *.
//If no path exists, print "No solution found."
//
//Hints:
//Consider using a Depth-First Search (DFS) or Breadth-First Search (BFS) algorithm for pathfinding.
//You might want to represent the maze using a class with methods to detect neighbors, check for walls, etc.

// will use BFS because that feels neater for me
// its possible that DFS wont give optimal path


public class challange13 {

    static final int M = 5;
    static final int N = 5;
    static char[][] maze = new char[][]{
            {'S', '1', '0', '1', '1'},
            {'0', '0', '1', '0', '1'},
            {'0', '1', '0', '1', '1'},
            {'0', '1', '0', '0', '0'},
            {'0', '0', '0', '1', 'E'}
    };
    static int[][][] parentCells = new int[M][N][2];
    static boolean[][] visited = new boolean[M][N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[][] path = new int[M*N][2]; //at most the path includes all squares
//        int pathSze = 0;
        Queue<int[]> cellsToCheck = new LinkedList<>();

        FINDSTART:
        for (int y = 0; y < maze.length; y++) {
            for (int x = 0; x < maze[0].length; x++) {
                if (maze[y][x] == 'S') {
                    cellsToCheck.add(new int[]{y, x});
                    visited[y][x] = true;
                    break FINDSTART;
                }
            }
        }

        boolean foundExit = false;
        while (cellsToCheck.size() > 0 && !foundExit) {

            // dequeue an element
            // for all directions
            //  if E then break
            //  if not visited and not wall and not outofbounds add to cellstocheck
            // repeat untill either found e or checked all possilbe

            int[] currentCell = cellsToCheck.remove();
            int yc = currentCell[0];
            int xc = currentCell[1];

            int[][] dirs = new int[][]{
                    {yc, xc + 1},
                    {yc, xc - 1},
                    {yc + 1, xc},
                    {yc - 1, xc},
            };
            for (int[] dir : dirs) {
                int y = dir[0];
                int x = dir[1];

                boolean outOfBounds = x < 0 || x > N - 1 || y < 0 || y > M - 1;
                if (!outOfBounds) {
                    boolean isExit = maze[y][x] == 'E';
                    if (isExit) {
                        parentCells[y][x][0] = yc;
                        parentCells[y][x][1] = xc;
                        visited[y][x] = true;
                        cellsToCheck.add(new int[]{y, x});
                        foundExit = true;
                        break;
                    }

                    boolean isSolid = maze[y][x] != '0';
                    boolean isVisited = visited[y][x];
                    if (!isSolid && !isVisited) {
                        parentCells[y][x][0] = yc;
                        parentCells[y][x][1] = xc;
                        visited[y][x] = true;
                        cellsToCheck.add(new int[]{y, x});
                    }
                }
            }

        }


        if (foundExit) {
            System.out.println("Yay found the exit");
            int[] cell = cellsToCheck.remove();
            int y = cell[0];
            int x = cell[1];
            int curChar = maze[y][x];
            if (curChar != 'E') {
                // should throw an error instead
                System.out.println("Darn");
            }
            while (curChar != 'S') {
                if (curChar != 'E') {
                    maze[y][x] = '*';
                }
                int[] parentCell = parentCells[y][x];
                y = parentCell[0];
                x = parentCell[1];
                curChar = maze[y][x];
            }

            for (int yy = 0; yy < maze.length; yy++) {
                for (int xx = 0; xx < maze[0].length; xx++) {
                    System.out.print(maze[yy][xx] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Though beans bud, no exit");
        }

        sc.close();
    }
}

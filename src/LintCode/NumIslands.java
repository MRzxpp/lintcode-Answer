package LintCode;

/**
 * Created by Zhongsz on 2016/9/2.
 */
public class NumIslands {
    /**
     * 求岛屿的个数
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    private static int numIslands(boolean[][] grid) {
        // Write your code here
//        grid = new boolean[][]{{true, true, false, false, false}, {false, true, false, false, true}, {false, false, false, true, true}, {false, false, false, false, false}, {false, false, false, false, true}};
//        grid = new boolean[][]{{true}};
//        grid = new boolean[][]{{true, true}};
//        grid = new boolean[][]{{true, false}, {false, true}};
        int num = 0;
//        System.out.println(grid.length);
//        System.out.println(grid[0][0]);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
//                if ((grid[i][j] && (grid[i][j] == grid[i + 1][j] || grid[i][j] == grid[i][j + 1] || grid[i][j] == grid[i - 1][j] || grid[i][j] == grid[i][j - 1]))
//                        || (grid[i][j] && (!grid[i + 1][j] && !grid[i][j + 1] && !grid[i - 1][j] && !grid[i][j - 1]))) {
//                    num++;
//                }
                if (grid[i][j]) {
                    num++;
                    visit(grid, i, j);
                }


//                if (i >= 1 && j >= 1 && grid[i][j] && (grid[i - 1][j] || grid[i][j - 1])) {
//                    num--;
//                }

            }
        }

//        if (grid.length == 1 && grid[0][0]) {
//            num++;
//        }
        return num;
    }

    private static void visit(boolean[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;
        if (grid[i][j]) {
            grid[i][j] = false;
            visit(grid, i - 1, j);
            visit(grid, i + 1, j);
            visit(grid, i, j - 1);
            visit(grid, i, j + 1);
        }
    }

    public static void main(String[] args) {
        boolean[][] grid = new boolean[5][5];
        System.out.println(numIslands(grid));
    }
}
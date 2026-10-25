class Solution {
    public int closedIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && !visited[i][j]) {
                    if (dfs(grid, i, j, visited)) count++;
                }
            }
        }
        return count;
    }

    private boolean dfs(int[][] grid, int r, int c, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;

        if (r < 0 || c < 0 || r >= m || c >= n)  return false;
        

        if (grid[r][c] == 1 || visited[r][c]) return true;
        visited[r][c] = true;
        boolean up = dfs(grid, r - 1, c, visited);
        boolean down = dfs(grid, r + 1, c, visited);
        boolean left = dfs(grid, r, c - 1, visited);
        boolean right = dfs(grid, r, c + 1, visited);
        return up && down && left && right;
    }
}

class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];

        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '#';
            }
        }

        // First row is free
        for (int j = 0; j < n; j++) {
            grid[0][j] = '.';
        }

        // Last column is free
        for (int i = 0; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        // Convert each row into a String
        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }

        return ans;
    }
}
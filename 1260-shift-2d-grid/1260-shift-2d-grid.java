class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] temp = new int[m*n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                 int index = i * n + j;
                 temp[(index + k) % (m * n)] = grid[i][j];
            }
        }
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(temp[i * n + j]);
            }

        li.add(row);
    }
    return li;
    }
}
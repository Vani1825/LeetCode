class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int dp[][] = new int[n][n];
        int down = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1) {
                    dp[i][j] = matrix[i][j];
                } else {
                    down = dp[i + 1][j];
                    int left = Integer.MAX_VALUE;
                    int right = Integer.MAX_VALUE;
                    if (j > 0) {
                        left = dp[i + 1][j - 1];
                    }
                    if (j < n - 1) {
                        right = dp[i + 1][j + 1];
                    }

                    dp[i][j] = matrix[i][j] + Math.min(down, Math.min(left, right));
                }
            }
        }
        int min = Integer.MAX_VALUE;;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min, dp[i][j]);
            }
        }
        return min;
    }
}
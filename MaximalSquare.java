//Leetcode - 221
//TimeComplexity - O(M*N)
//SpaceComplexity - O(M*N)
public class MaximalSquare {

    //O(M*N) time and space
    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m+1][n+1];
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if(matrix[i-1][j-1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max*max;
    }
}

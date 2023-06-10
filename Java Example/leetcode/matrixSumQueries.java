import java.util.Arrays;

public class matrixSumQueries {
    public static long matrixSumQueries1(int n, int[][] queries){
        long ans = 0;
//        seen[0] = row, seen[column]
        boolean[][] seen = new boolean[2][n];
//        notSet[0] = row , notSet[1] = column
        int[] notSet = new int[2];
        Arrays.fill(notSet, n);

//        dominate queries
        for(int i = queries.length - 1; i >= 0; i--){
            final int type = queries[i][0];
            final int index = queries[i][1];
            final int val = queries[i][2];
            if (!seen[type][index]){
                ans += (long) val * notSet[type ^ 1];
                seen[type][index] = true;
                --notSet[type];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] queries = {{0,0,1},{1,2,2},{0,2,3},{1,0,4}};
        System.out.println(matrixSumQueries1(n, queries));
    }
}

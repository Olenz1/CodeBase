package dynamicProgramming;

import java.util.Scanner;


/*
数字三角形
    状态表示f[i,j]
        集合：所有从起点，走到(i,j)的路径
        属性：
    状态计算:f[i][j] = Max(f[i-1,j-1],f[i-1,j]) + a[i][j]
*/
public class DigitalTriangle {
    static int N = 510, INF = (int) 1e9;

    static int n;
    static int[][] a = new int[N][N];
    static int[][] f = new int[N][N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i; j++)
                a[i][j] = sc.nextInt();

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i + 1; j++)
                f[i][j] = -INF;

        f[1][1] = a[1][1];
        for (int i = 2; i <= n; i++)
            for (int j = 1; j <= i; j++)
                f[i][j] = Math.max(f[i-1][j-1], f[i-1][j]) + a[i][j];

        int res = -INF;
        for (int i = 1; i <= n; i++) res = Math.max(res, f[n][i]);

        System.out.println(res);
    }
}

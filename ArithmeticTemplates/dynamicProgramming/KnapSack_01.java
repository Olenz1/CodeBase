package dynamicProgramming;

import java.util.Scanner;

public class KnapSack_01 {
    static int n, m;
    static int v[];
    static int w[];
    static int f[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        v = new int[n + 1];
        w = new int[n + 1];
        f = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= v[i]; j--) {
                f[j] = Math.max(f[j], f[j - v[i]] + w[i]);
            }
        }

        System.out.println(f[m]);
    }
}

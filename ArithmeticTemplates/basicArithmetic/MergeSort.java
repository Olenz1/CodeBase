package basicArithmetic;

import java.util.Scanner;

public class MergeSort {
    private static int N = 1000010;
    private static int n;
    private static int[] q = new int[N];
    private static int[] temp = new int[N];

    private static void mergeSort(int[] q, int l, int r) {
        if (l == r) return;

        int mid = (l + r) >> 1;

        mergeSort(q, l, mid);
        mergeSort(q, mid + 1, r);

        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            if (q[i] <= q[j]) temp[k++] = q[i++];
            else temp[k++] = q[j++];
        }
        while (i <= mid) temp[k++] = q[i++];
        while (j <= r) temp[k++] = q[j++];

        for (int x = l, y = 0; x <= r; x++, y++) q[x] = temp[y];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            q[i] = scanner.nextInt();
        }

        mergeSort(q, 0, n - 1);

        for(int i = 0; i < n; i++) {
            System.out.print(q[i] + " ");
        }
    }



}

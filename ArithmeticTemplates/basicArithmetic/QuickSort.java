import java.util.Scanner;

class QuickSort {
    public static void main(String[] args) {
        int[] q = {-1, 2, 0, 9};
        new QuickSort().quickSort(q, 0, q.length - 1);
        for (int i = 0; i < q.length; i++)
            System.out.print(q[i] + " ");
    }

    private void quickSort(int q[], int l, int r) {
        if (l == r) return;

        int pivot = q[l];
        int i = l - 1, j = r + 1;
        while (i < j) {
            do i++; while (q[i] < pivot);
            do j--; while (q[j] > pivot);
            if (i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }
}


//第k小数代码
//import java.util.Scanner;

class Main2{
    private static int N = 1000010;
    private static int[] q = new int[N];
    private static int n, k;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        for (int i = 0; i < n; i++) q[i] = scanner.nextInt();

        System.out.print(quickSort(k - 1, 0, n - 1));


    }

    public static int quickSort(int k, int l, int r) {
        if (l == r) return q[k];
        int pivot = q[l], i = l - 1, j = r + 1;

        while (i < j) {
            do i++; while(q[i] < pivot);
            do j--; while(q[j] > pivot);

            if(i < j) {
                int temp = q[i];
                q[i] = q[j];
                q[j] = temp;
            }
        }

        if (k <= j) return quickSort(k, l, j);
        else return quickSort(k, j + 1, r);
    }
}

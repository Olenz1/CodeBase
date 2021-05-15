import java.util.Scanner;

class bsearch {
    static int N = 1000010;
    static int n, m;
    static int[] q = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) q[i] = sc.nextInt();

        while (m-- != 0) {
            int x;
            x = sc.nextInt();

            int l = 0, r = n - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (q[mid] >= x) r = mid;
                else l = mid + 1;
            }

            if (q[l] != x) System.out.println(-1 + " " + -1);
            else {
                System.out.println(l + ' ');

                l = 0;
                r = n - 1;
                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    if (q[mid] <= x) l = mid;
                    r = mid - 1;
                }

                System.out.println(l);
            }
        }
    }
}
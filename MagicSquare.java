import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an odd dimension: ");
        int n = sc.nextInt();

        int[][] magic = new int[n][n];

        int i = 0;
        int j = n / 2;

        for (int num = 1; num <= n * n; num++) {
            magic[i][j] = num;

            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magic[newi][newj] != 0) {
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }
        }

        System.out.println("Magic Square:");

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
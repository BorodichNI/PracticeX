public class Snake implements Aggregate {

    @Override
    public void aggregate(int n) {
        int array[][] = new int[n][n];

        int row = 0;
        int col = 0;
        int step = 0;
        int i = 0;

        for (int z = 0; i < n * n - 1; z++) {

            for (int j = 0; j < n - step; j++) {
                array[row][col++] = ++i;
            }
            col--;
            ++step;

            for (int k = 0; k < n - step; k++) {
                array[++row][col] = ++i;
            }

            for (int l = 0; l < n - step; l++) {
                array[row][--col] = ++i;
            }
            ++step;

            for (int m = 0; m < n - step; m++) {
                array[--row][col] = ++i;
            }
            col++;

            if (n % 2 != 0) {
                for (int b = 0; b < n - step; b++) {
                    array[row][col] = ++i;
                }
            }
        }

        for (int d = 0; d < n; d++) {
            for (int s = 0; s < n; s++) {
                System.out.print(array[d][s] + "\t");
            }
            System.out.println();
        }

    }

}
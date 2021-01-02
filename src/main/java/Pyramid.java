public class Pyramid implements Aggregate {

    @Override
    public void aggregate(int o) {
        int array[][] = new int[o][o];

        int row = 0;
        int col = 0;
        int step = 0;
        int i = 0;
        int x = 1;
        int c = 1;
        int v = 1;
        int a = 1;


        for (int z = 0; i < o * o - 1; z++) {

            for (int j = 0; j < o - step; j++) {
                array[row][col++] = x;
                i++;
            }
            x++;
            col--;
            ++step;

            for (int k = 0; k < o - step; k++) {
                array[++row][col] = c;
                i++;
            }
            c++;

            for (int l = 0; l < o - step; l++) {
                array[row][--col] = v;
                i++;
            }
            v++;
            ++step;

            for (int m = 0; m < o - step; m++) {
                array[--row][col] = a;
                i++;
            }

            a++;
            col++;
            if (o % 2 != 0) {
                for (int j = 0; j < o - step; j++) {
                    array[row][col] = x;
                }
            }

        }

        for (int d = 0; d < o; d++) {
            for (int s = 0; s < o; s++) {
                System.out.print(array[d][s] + "\t");
            }
            System.out.println();
        }
    }
}
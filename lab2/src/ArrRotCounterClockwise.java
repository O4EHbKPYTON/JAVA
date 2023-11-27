public class ArrRotCounterClockwise {
    public static void print(int mat[][]) {

        for (int i = 0; i < mat.length; i++)
        {
            System.out.print("| ");
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print("|\n");
        }


    }
    public static int[][] ArrayRotate90DegreesCounterClockwise(int[][] mat) {
        final int M = mat.length;
        final int N = mat[0].length;
        int[][] res = new int[N][M];
        for (int row = 0; row < M; row++) {
            for (int column = 0; column < N; column++) {
                res[N-1-column][row] = mat[row][column];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] res = ArrayRotate90DegreesCounterClockwise(array);
        System.out.println("Матрица : \n");
        print(res);
    }
}

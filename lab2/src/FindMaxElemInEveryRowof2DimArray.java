public class FindMaxElemInEveryRowof2DimArray {
    public static int Sum(int[][] mat)
    {
        int max=0;
        final int M = mat.length;
        final int N = mat[0].length;
        for (int row = 0; row < M; row++) {
            for (int column = 0; column < N; column++) {
                if (max< mat[row][column])
                {
                    max = mat[row][column];
                }
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        int[][] array ={{1,2,3,4},{5,6,7,8}};
        int res=Sum(array);
        System.out.println("Максимальный элемент : \n"+res);

    }
}

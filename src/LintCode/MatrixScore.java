package LintCode;

public class MatrixScore {
    public static int matrixScore(int[][] matrix) {
        int socre = 0;

        if (matrix.length == 0) {
            return socre;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0)
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j] == 0 ? 1 : 0;
                }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int sumZero = 0;
            int sumOne = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 0) {
                    sumZero++;
                } else {
                    sumOne++;
                }
            }
            if (sumZero > sumOne) {
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int bit = matrix[i].length;
            for (int j = 0; j < bit; j++) {
                socre += matrix[i][j] << (bit - j - 1);
            }
        }

        return socre;
    }

    public static void main(String args[]) {
        int[][] matrix = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        System.out.println("The score of the matrix is: " + matrixScore(matrix));
    }

}

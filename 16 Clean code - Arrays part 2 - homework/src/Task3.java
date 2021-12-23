public class Task3 {

    static boolean isMagical = true;

    public static void main(String[] args) {
        printResult();
    }

    private static void printResult() {
        int[][] square = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
        int sumDiagonalOne = calculateDiagonalOne(square);
        int sumDiagonalTwo = calculateDiagonalTwo(square);
        isMagical(sumDiagonalOne, sumDiagonalTwo);
        calculateRowSum(square, sumDiagonalOne);
        calculateColSum(square, sumDiagonalOne);
        System.out.println(isMagical ? "Magical Square" : "It is not a magical square");
    }

    private static void calculateColSum(int[][] square, int sumDiagonalOne) {
        for (int i = 0; i < square.length; i++) {
            int currentColSum = 0;
            for (int j = 0; j < square[i].length; j++) {
                currentColSum += square[j][i];
            }

            isMagical(currentColSum, sumDiagonalOne);
        }
    }

    private static void calculateRowSum(int[][] square, int sumDiagonalOne) {
        for (int i = 0; i < square.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < square[i].length; j++) {
                currentRowSum += square[i][j];
            }

            isMagical(currentRowSum, sumDiagonalOne);
        }
    }

    private static void isMagical(int sumDiagonalOne, int sumDiagonalTwo) {
        if (sumDiagonalOne != sumDiagonalTwo) {
            isMagical = false;
        }
    }

    private static int calculateDiagonalTwo(int[][] square) {
        int sumDiagonalTwo = 0;
        for (int i = 0; i < square.length; i++) {
            sumDiagonalTwo += square[i][square.length - 1 - i];
        }
        return sumDiagonalTwo;
    }

    private static int calculateDiagonalOne(int[][] square) {
        int sumDiagonalOne = 0;
        for (int i = 0; i < square.length; i++) {
            sumDiagonalOne += square[i][i];
        }
        return sumDiagonalOne;
    }
}

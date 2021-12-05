public class Task3 {

    public static void main(String[] args) {

        int[][] square = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        int sumDiagonalOne = 0;
        int sumDiagonalTwo = 0;

        for (int i = 0; i < square.length; i++) {
            sumDiagonalOne += square[i][i];
        }

        for (int i = 0; i < square.length; i++) {
            sumDiagonalTwo += square[i][square.length - 1 - i];
        }

        boolean isMagical = true;

        if (sumDiagonalOne != sumDiagonalTwo) {
            isMagical = false;
        }

        for (int i = 0; i < square.length; i++) {

            int currentRowSum = 0;

            for (int j = 0; j < square[i].length; j++) {
                currentRowSum += square[i][j];
            }

            if (currentRowSum != sumDiagonalOne) {
                isMagical = false;
            }
        }

        for (int i = 0; i < square.length; i++) {
            int currentColSum = 0;

            for (int j = 0; j < square[i].length; j++) {
                currentColSum += square[j][i];
            }

            if (currentColSum != sumDiagonalOne) {
                isMagical = false;
            }
        }

        System.out.println(isMagical ? "Magical Square" : "It is not a magical square");
    }
}

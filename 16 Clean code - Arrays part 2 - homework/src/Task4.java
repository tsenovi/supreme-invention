public class Task4
{

    public static void main(String[] args) {

        int[][] square = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };
        calculateOddColumnSum(square);
    }

    private static void calculateOddColumnSum(int[][] square) {
        for (int row = 0; row < square.length; row++) {
            int oddColSum = 0;
            for (int col = 0; col < square.length; col++) {
                if (row % 2 == 0) {
                    oddColSum += square[col][row];
                    System.out.print(square[col][row] + ", ");
                }
            }

            printResult(oddColSum);
        }
    }

    private static void printResult(int oddColSum) {
        if (oddColSum != 0) {
            System.out.println("The sum of the elements is: " + oddColSum);
        }
    }
}

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        printResult();
    }

    private static void printResult() {
        int[][] reviewersGrades = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}};
        int[] grades = createOneDimensionalArray(reviewersGrades);
        System.out.println("Sorted array: " + Arrays.toString(sortArray(grades)));
    }

    private static int[] createOneDimensionalArray(int[][] reviewersGrades) {
        int[] grades = new int[reviewersGrades.length * reviewersGrades[0].length];
        int gradesIndex = 0;
        for (int rows = 0; rows < reviewersGrades.length; rows++) {
            for (int cols = 0; cols < reviewersGrades[rows].length; cols++) {
                grades[gradesIndex] = reviewersGrades[rows][cols];
                gradesIndex++;
            }
        }

        return grades;
    }

    private static int[] sortArray(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[minIndex] > grades[j]) {
                    minIndex = j;
                }
            }

            int swap;
            if (minIndex != i) {
                swap = grades[minIndex];
                grades[minIndex] = grades[i];
                grades[i] = swap;
            }
        }

        return grades;
    }
}

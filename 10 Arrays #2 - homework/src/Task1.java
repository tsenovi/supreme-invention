import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] reviewersGrades = {4, 6, 2, 5, 7, 9, 4, 8, 6, 9, 3, 7};

        for (int i = 0; i < reviewersGrades.length; i++) {

            int minIndex = i;
            for (int j = i + 1; j < reviewersGrades.length; j++) {

                if (reviewersGrades[minIndex] > reviewersGrades[j]) {
                    minIndex = j;
                }
            }

            int swap;
            if (minIndex != i) {
                swap = reviewersGrades[minIndex];
                reviewersGrades[minIndex] = reviewersGrades[i];
                reviewersGrades[i] = swap;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(reviewersGrades));
    }

}

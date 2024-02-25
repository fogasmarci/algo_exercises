package matrixmanipulation;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 9, 1, 0, 0, 0},
                {0, 9, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };

        int maxHourglassSum = findMaxHourglassSum(matrix);
        System.out.println("Maximum hourglass sum: " + maxHourglassSum);
    }

    public static int findMaxHourglassSum(int[][] matrix) {
        int maxSum = 0;

        for (int i = 0; i <= matrix.length - 3; i++) {
            for (int j = 0; j <= matrix[i].length - 3; j++) {
                int currentSum = calculateHourglassSum(matrix, i, j);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }

    private static int calculateHourglassSum(int[][] matrix, int row, int col) {
        return matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                + matrix[row + 1][col + 1]
                + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
    }
}

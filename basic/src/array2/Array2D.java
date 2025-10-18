package array2;

public class Array2D {

    public String getMatrixInfo(int[][] matrix) {
        String result = "";
        int total = 0;
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            result = result + "Row " + (i + 1) + ": ";
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                total += value;
                count++;

                // Tentukan ganjil (O) atau genap (E)
                String parity = (value % 2 == 0) ? "E" : "O";
                result = result + value + parity + " ";
            }
            result = result + "\n";
        }

        double average = (double) total / count;
        result = result + "Total: " + total + "\n";
        result = result + "Average: " + average;

        return result;
    }
}

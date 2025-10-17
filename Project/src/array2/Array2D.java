package array2;

public class Array2D {
    public String getMatrixInfo(int[][] matrix) {
        int total = 0;
        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            result += "Row " + (i + 1) + ": ";
            for (int j = 0; j < matrix[i].length; j++) {
                int val = matrix[i][j];
                total += val;
                result += val + (val % 2 == 0 ? "E " : "O ");
            }
            result += "\n";
        }
        double avg = (double) total / (matrix.length * matrix[0].length);
        result += "Total: " + total + "\nAverage: " + avg;
        return result.trim();
    }
}

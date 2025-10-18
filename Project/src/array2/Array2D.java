package array2;

public class Array2D {
    // Menampilkan isi matriks, total, dan rat-rata
    public String getMatrixInfo(int[][] matrix) {
        int total = 0;
        String result = "";
        for (int i = 0; i < matrix.length; i++) {
            result += "Row " + (i + 1) + ": ";
            for (int j = 0; j < matrix[i].length; j++) {
                int val = matrix[i][j];                       // Ambil elemen
                total += val;                                 // Tambahkan ke total
                result += val + (val % 2 == 0 ? "E " : "O "); // Tambahkan E jika genap, 0 jika ganjil
            }
            result += "\n";
        }
        double avg = (double) total / (matrix.length * matrix[0].length);
        result += "Total: " + total + "\nAverage: " + avg;
        return result.trim();                                  // Hapus spasi di akhir
    }
}

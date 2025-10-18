package looping2;

public class ForLoopNested {
    //  Membuat grid baris dan kolom
    public String getGrid(int n) {
        String result = "";                                   // Menyimpan hasil
        for (int row = 1; row <= n; row++) {                  // Baris
            for (int col = 1; col <= n; col++) {              // Kolom
                result += "Row " + row + " Col " + col;       
                if (!(row == n && col == n)) result += "\n";  // Tambahkan baris baru kecuali di akhir
            }
        }
        return result;
    }
}

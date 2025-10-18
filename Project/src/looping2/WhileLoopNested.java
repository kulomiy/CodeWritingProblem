package looping2;

public class WhileLoopNested {
    // Membuat pola segitiga dengan simbol '*'
    public String getTriangle(int n) {
        String result = "";                // Menyimpan hasil
        int i = 1;                         // Baris mulai dari 1
        while (i <= n) {
            int j = 1;                     // Kolom mulai dari 1
            while (j <= i) {
                result += "*";             // Tambahkan bintang
                j++;
            }
            if (i < n) result += "\n";     // Ganti baris kecuali baris terakhir
            i++;
        }
        return result;
    }
}

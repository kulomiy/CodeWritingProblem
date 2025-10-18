package looping2;

public class DoWhileLoopNested {
    // Membuat segitiga angka
    public String getNumberTriangle(int n) {
        if (n <= 0) return "0";          // Jika 0, kembalikan "0"
        String result = "";
        int i = 1;
        do {
            int j = 1;
            do {
                result += j;             // Tambahkan angka j
                j++;
            } while (j <= i);
            if (i < n) result += "\n";   // Pindah baris jika belum terakhir
            i++;
        } while (i <= n);
        return result;
    }
}

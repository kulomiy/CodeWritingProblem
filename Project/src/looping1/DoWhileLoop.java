package looping1;

public class DoWhileLoop {
    // Menjumlahkan semua bilangan ganjil sampai n
    public int getOddNumbersAndSum(int n) {
        int i = 1, sum = 0;                  // Inisialisasi
        if (n <= 0) return 0;                // Jika n <= 0, langsung 0
        do {
            if (i % 2 != 0)                  // Jika ganjil
                sum += i;                    // Tambahkan jumlah
            i++;                             // Naikan 1
        } while (i <= n);                    // Ulang hingga n
        return sum;                          // Hasil akhir
    }
}

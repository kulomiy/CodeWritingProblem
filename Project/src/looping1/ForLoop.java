package looping1;

public class ForLoop {
    // Menampilkan angka dari 1 sampai n
    public int getNumbersAndSum(int n) {
        int sum = 0;                              // Variabel penampung jumlah
        for (int i = 1; i <= n; i++)              // Loop dari 1 hingga n
            sum += i;                             // Tambahkan nilai i ke sum
        return sum;                               // Kembalikan hasil jumlah
    }
}

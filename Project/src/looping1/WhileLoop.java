package looping1;

public class WhileLoop {
    // Menerjemahkan semua bilangan genap sampai n
    public int getEvenNumbersAndSum(int n) {
        int sum = 0;                           // Total
        int i = 1;                             // Awal hitungan
        while (i <= n) {                       // Ulangi sampai i melebihi n
            if (i % 2 == 0) sum += i;          // Jika genap
            i++;                               // Naikan i
        }
        return sum;                            // Kembalikan hasil akhir
    }
}

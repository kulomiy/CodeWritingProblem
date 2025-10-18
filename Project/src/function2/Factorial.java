package function2;

public class Factorial {
    // Menghitung faktorial secara rekursif
    public int factorial(int n) {
        if (n == 0) return 1;              // Baris: faktorial 0 = 1
        else return n * factorial(n - 1);  // Rekursi: n x faktorial(n-1)
    }
}

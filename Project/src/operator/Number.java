package operator;

public class Number {
    // Method untuk menampilkan hasil operasi aritmatika dan logika
    public String getOperatorResults(int a, int b) {
        int sum = a + b;                        // Pemjumlahan
        int product = a * b;                    // Perkalian
        boolean isEqual = (a == b);             // Perbandingan sama tidak 
        boolean logicalAnd = (a > 0 && b > 0);  // Logika AND
        boolean logicalOr = (a < 0 || b > 0);   // LOgika OR

        // Menggunakan hasil ke dalam sutu string (baris demi baris)
        return "Sum: " + sum + "\n" +
               "Product: " + product + "\n" +
               "Is Equal: " + isEqual + "\n" +
               "Logical AND: " + logicalAnd + "\n" +
               "Logical OR: " + logicalOr;
    }
}

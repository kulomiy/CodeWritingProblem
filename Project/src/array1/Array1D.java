package array1;

public class Array1D {
    // Membuat isi array dan jumlah total
    public String getArrayInfo(int[] arr) {
        int sum = 0;
        String data = "";
        for (int i = 0; i < arr.length; i++) {
            data += arr[i];                      // Tambahkan elemen ke String
            if (i < arr.length - 1)              // Tambah spasi antar elemen
                data += " ";                     // Tambahkan nilai ke total
            sum += arr[i];
        }
        return data + "\nSum: " + sum;           // Gabungan hasil akhir
    }
}

package condition1;

public class DayOfWeek {
    // Method untuk menentukan nama hari berdarkan angka
    public String getDayName(int day) {
        String name;   // Variabel unutk menyimpan nama hari
        switch (day) {
            case 1: name = "Monday"; break;        // 1 = Senin
            case 2: name = "Tuesday"; break;       // 2 = Selasa
            case 3: name = "Wednesday"; break;     // 3 = Rabu
            case 4: name = "Thursday"; break;      // 4 = Kamis
            case 5: name = "Friday"; break;        // 5 = Jumat
            case 6: name = "Saturday"; break;      // 6 = Sabtu
            case 7: name = "Sunday"; break;        // 7 = Minggu
            default: name = "Unknown"; break;      // Selain 1-7 = tidak dikenal
        }
        return "Day: " + name; // Mengembalikan hasil
    }
}

package condition1;

public class Grade {
    // Method menentukan nilai huruf berdasarkan skor
    public String getGrade(int score) {
        if (score >= 90)                 // Jika skor >= 90
            return "Grade: A";           // Nilai A
        else if (score >= 75)            // Jika skor < 90
            return "Grade: B";           // Nilai B
        else if (score >= 60)            // Jika skor <= 60 skor < 75
            return "Grade: C";           // Nilai C
        else                             // Jika < 60
            return "Grade: F";           // Nilai F (Gagal)
    }
}

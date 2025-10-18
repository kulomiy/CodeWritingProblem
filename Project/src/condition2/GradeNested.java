package condition2;

public class GradeNested {
    // Method menentukan nilai berdarkan mata pelajaran dan skor
    public String getGradeInfo(String subject, int score) {
        if (subject.equals("Math")) {            // Jika pelajaran = Matematika
            if (score >= 90) return "Subject: Math, Grade: A";
            else if (score >= 75) return "Subject: Math, Grade: B";
            else return "Subject: Math, Grade: C";
        } else if (subject.equals("English")) {  // Jika pelajaran = Bahasa Inggris
            if (score >= 85) return "Subject: English, Grade: A";
            else if (score >= 70) return "Subject: English, Grade: B";
            else return "Subject: English, Grade: C";
        } else {                                          // Jika pelajaran lain
            return "Subject: Unknown, Grade: N/A";        // Tidak diketahui
        }
    }
}

package identifier;

public class StudentInfo {

    // Method untuk menampilkan informasi mahasiswa
    public String showStudentInfo(String name, int age, double gpa) {
        // Menggabungkan data menjadi satu string dengan format tertentu
        return "Name: " + name + "\n" + // Menampilkan nama
               "Age : " + age + "\n" + // Menampilkan umur
               "GPA : " + gpa + "\n"; // Menampilkan nilai GPA
    }
}

package identifier;

public class StudentInfo {

    // Method untuk menampilkan informasi mahasiswa
    public String showStudentInfo(String name, int age, double gpa) {
        // Menggabungkan data menjadi satu string dengan format tertentu
        return "Name: " + name + "\n" +
               "Age : " + age + "\n" +
               "GPA : " + gpa + "\n";
    }
}

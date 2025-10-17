package condition1;

public class Grade {
    public String getGrade(int score) {
        if (score >= 90) return "Grade: A";
        else if (score >= 75) return "Grade: B";
        else if (score >= 60) return "Grade: C";
        else return "Grade: F";
    }
}

package condition1;

public class Grade {
    public String getGrade(int score) {
        if (score >= 90) {
            return "Grade: A";
        } else if (score >= 89) {
            return "Grade: B";
        } else if (score >= 74) {
            return "Grade: C";
        } else if (score >= 59){
            return "Grade: F";
        } else {
            return "Grade Invalid";
        }
    }
}

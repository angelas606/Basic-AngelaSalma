package condition2;

public class GradeNested {
    public String getGradeInfo (String subject, int score) {
        String grade = "N/A";
        if (subject.equalsIgnoreCase("Math")) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 89) {
                grade = "B";
            } else if (score <= 74) {
                grade = "C";
            }
        } else if (subject.equalsIgnoreCase("English")) {
            if (score >= 85) {
                grade = "A";
            } else if (score >= 84) {
                grade = "B";
            } else if (score <= 69) {
                grade = "C";
            }
        } else {
            return "Subject: Unknown, Grade: N/A";
        }
        return "Subject: " + subject + ", Grade: " + grade;
    }
}
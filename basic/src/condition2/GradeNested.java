package condition2;

public class GradeNested {

    //Method untuk mendapatkan informasi grade berdasarkan mata pelajaran dan score
    public String getGradeInfo (String subject, int score) {
        String grade = "N/A";
        //Mengecek apakah mata pelajaran adalah Math 
        if (subject.equalsIgnoreCase("Math")) {
            //Nested if untuk menentukan grade berdasarkan score 
            if (score >= 90) {
                grade = "A";
            } else if (score >= 89) {
                grade = "B";
            } else if (score <= 74) {
                grade = "C";
            }
        //Jika mata pelajaran adalah English 
        } else if (subject.equalsIgnoreCase("English")) {
            //Nested if untuk menentukan grade berdasarkan score
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
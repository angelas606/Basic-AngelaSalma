package identifier;

public class StudentInfo {

    //Method untuk menampilkan informasi mahasiswa
    public String showStudentInfo(String name, int age, double gpa) {
       
        //Mengembalikan string berisi data mahasiswa (name, age, gpa)
        return "Name: " + name + "\n" +
               "Age : " + age + "\n" +
               "GPA : " + gpa + "\n";
    }
}

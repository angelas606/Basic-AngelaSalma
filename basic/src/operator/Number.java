package operator;

public class Number {
    public String getOperatorResults(int a, int b) {

        //Mengembalikan hasil operasi a dan b 
        return "Sum: " + (a + b) + "\n" + //Menjumlahkan a dan b
               "Product: " + (a * b) + "\n" + //Mengalikan a dan b 
               "Is Equal: " + (a == b) + "\n" + //Mengecek apakah a dan b sama 
               "Logical AND: " + (a > 0 && b > 0) + "\n" + //True jika keduanya positif 
               "Logical OR: " + (a < 0 || b > 0); //True jika salah satu negatif 
    }
}

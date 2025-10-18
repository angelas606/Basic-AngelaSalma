package array1;

public class Array1D {

    //Method untuk mendapatkan infomasi dari array 1 dimensi dan menghitung jumlah elemennya 
    public String getArrayInfo(int[] array) {
        String result = "";
        int sum = 0;

        //Perulangan untuk membaca tiap elemen array
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
            if (i < array.length - 1) {
                result = result + " ";
            }
            sum += array[i]; //Menambahkan nilai elemen ke variabel sum 
        }

        //Menambahkan hasil jumlah (sum) ke output akhir
        result = result + "\nSum: " + sum;
        return result;
    }
}

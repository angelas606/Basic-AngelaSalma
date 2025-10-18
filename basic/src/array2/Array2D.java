package array2;

public class Array2D {

    //Method untuk mendaptkan informasi dari array 2 dimensi (matrix)
    public String getMatrixInfo(int[][] matrix) {
        String result = ""; //Inisialisasi string hasil
        int total = 0; //Inisialisasi total elemen matrix
        int count = 0; //Inisialisasi jumlah elemen matrix

        //Perulangan untuk mengakses tiap baris dari matrix
        for (int i = 0; i < matrix.length; i++) {
            result = result + "Row " + (i + 1) + ": ";

            //Perulangan untuk mengakses tiap elemen dari baris matrix
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                total += value;
                count++;

                // Tentukan ganjil (O) atau genap (E)
                String parity = (value % 2 == 0) ? "E" : "O";
                result = result + value + parity + " ";
            }
            result = result + "\n";
        }

        //Menghitung rata-rata 
        double average = (double) total / count;
        //Menambahkan total dan rata-rata ke dalam hasil 
        result = result + "Total: " + total + "\n";
        result = result + "Average: " + average;

        return result;
    }
}

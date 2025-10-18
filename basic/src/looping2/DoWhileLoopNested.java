package looping2;

public class DoWhileLoopNested {

    //Method untuk membuat segitiga angka menggunakan do-while nested 
    public String getNumberTriangle (int max) {
        String triangle = "";
        
        //Inisialisasi variabel i 
        int i = 1;
        do {
            //Inisialisasi variabel j untuk menghitung kolom
            int j = 1;
            do {
                triangle = triangle + j;
                j++;
            } while (j <= i);

            //Menambahkan baris baru kecuali di baris terakhir 
            if (i < max) { 
                triangle = triangle + "\n";
            }
            i++;
        } while (i <= max); //Ulangi sampai i lebih besar dari max 
        return triangle;
    }
}

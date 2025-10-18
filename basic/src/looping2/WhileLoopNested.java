package looping2;

public class WhileLoopNested {

    //Method untuk membuat pola segitiga menggunakan while loop nested 
    public String getTriangle (int max) {
        String triangle = "";
        //Inisialisasi i untuk menghitung baris 
        int i = 1;
        while (i <= max) {
            //Inisialisasi j untuk menghitung kolom
            int j = 1;
            //Perulangan untuk menambahkan bintang sebanyak nilai i 
            while (j <= i) {
                triangle = triangle + "*";
                j++;
            }
            //Menambahkan baris baru jika belum mencapai baris terakhir
            if (i < max) {  
                triangle = triangle + "\n";
            }
            i++;
        }
        return triangle;
    }
}

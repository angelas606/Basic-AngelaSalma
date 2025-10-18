package looping2;

public class ForLoopNested {

    //Method untuk membuat grid menggunakan for loop nested 
    public String getGrid(int max) {
        String grid = "";
        //Perulangan untuk mengatur baris (i)
        for (int i = 1; i <= max; i++) {
            //Perulangan untuk mengatur kolom (j)
            for (int j = 1; j <= max; j++) {
                grid = grid + "Row " + i + " Col " + j + "\n";
            }
        }
        //Menghapus baris baru terakhir 
        return grid.trim();
    }
}
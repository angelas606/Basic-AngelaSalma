package looping1;

public class DoWhileLoop {

    //Method untuk menghitung jumlah dari semua bilangan ganjil sampai batas max 
    public int getOddNumbersAndSum (int max) {
        int sum = 0;
        int i = 0;
        do {
            //Mengecek apakah i adalah bilangan ganjil 
            if (i % 2 != 0) {
                sum += i; //Jika ganjil, tambahkan ke total sum 
            }
            i++;
        } while (i <= max); //Ulangi selama i masih kurang atau sama dengan max
        return sum;
    }
}

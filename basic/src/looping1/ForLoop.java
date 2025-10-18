package looping1;

public class ForLoop {

    //Menghitung jumlah dari semua bilangan 1 sampai max 
    public int getNumbersAndSum(int max) {
        int sum = 0;
        //Perulangan for dari 1 hingga max 
        for (int i = 1; i <= max; i++) {
            sum += i; //Menambahkan nilai i ke total sum setiap iterasi 
        }
        return sum;
    }
}

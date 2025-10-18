package looping1;

public class WhileLoop {

    //Method untuk menghitung jumlah dari semua bilangan genap hingga max
    public int getEvenNumbersAndSum(int max) {
        int sum = 0;
        int i = 2;

        //Perulangan while akan tetap berjalan selma i masih kurang dari atau sama dengan max
        while (i <= max) {
            sum += i; //Menambahkan nilai i ke dalam sum 
            i += 2;
        }
        return sum;
    }
}

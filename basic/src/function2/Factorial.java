package function2;

public class Factorial {

    //Method untuk menghitung nilai faktorial dari bilangan n 
    public int factorial(int n) {
        
        //Jika n = 0 maka hasil faktorial adalah 1 
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); //Rumus faktorial 
        }
    }
}

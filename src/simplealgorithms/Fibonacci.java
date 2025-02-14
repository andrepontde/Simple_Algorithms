/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplealgorithms;

/**
 *
 * @author AndrePontDeAnda
 */
public class Fibonacci {

    public Fibonacci() {
    }

    private static int fibonacci(int n) {
        int fib;
        if ((n == 1) || (n == 2)) {
            fib = 1;
        } else {
            fib = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return fib;
    }
    
    public static void series(int n){
        int i;
        for (i = 1; i < n; i++){
            System.out.println("Element"+i+ "is "+ fibonacci(i));
        }
    }
    
    public static void main(String[] args){
        series(12);
    }
}

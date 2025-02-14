/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplealgorithms;

/**
 *
 * @author AndrePontDeAnda
 */
public class Power {

    public static int iterPower(int x, int y) {
        int xinit = x;

        for (int i = 1; i < y; i++) {
            x = x * xinit;
        }
        return x;
    }

    public static int recurPower(int x, int y) {
        
        if (y == 1) {
            return x;
        } else {
            return x * recurPower(x, y-1);
        }

    }

    public static void main(String[] args) {
        int x = iterPower(3, 5);
        System.out.println(x);
        int y = recurPower(3, 5);
        System.out.println(y);
    }
}

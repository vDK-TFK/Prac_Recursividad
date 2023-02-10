/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_recursividad;

/**
 *
 * @author andre
 */
public class Ejercicio4 {

    public double calcExponencial(int n, int x) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result = result + (Math.pow(x, i) / factorial(i));
        }
        return result;
    }

    public double factorial(int num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public double caclExponencialRecu(int n, int x) {

        if (n == 0) {
            return 1;
        } else {
            return (Math.pow(x, n) / factorial(n)) + caclExponencialRecu(n - 1, x);
        }
    }

    public double factorialrecu(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}

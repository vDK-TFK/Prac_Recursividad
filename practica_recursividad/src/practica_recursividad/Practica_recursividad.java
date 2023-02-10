/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Practica_recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        
        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el numero de la opcion que desea escoger: \n"
                    + "1. Ejercicio 1\n"
                    + "2. Ejercicio 2\n"
                    + "3. Ejercicio 3\n"
                    + "4. Ejercicio 4\n"
                    + "5. Salir"));
            
            if (opcion == 1) {
                Ejercicio1 Consonantes = new Ejercicio1();
                Consonantes.vocales(args);
            } else if (opcion == 2) {
                Ejercicio2 suma = new Ejercicio2();
                 
                 int Numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese "
                         + "el numero hasta el que desea sumar: "));
                 
                 int sumaNat = suma.sumaNumNat(Numero);
                 
                 JOptionPane.showMessageDialog(null,"La suma de todos"
                         + " los numeros naturales hasta "+ Numero+ " es: "+ sumaNat);
                
            } else if (opcion == 3) {
                
            } else if (opcion == 4) {
                Ejercicio4 c = new Ejercicio4();
                int exponencial = (int) c.calcExponencial(5, 2);
                int exponencialRec = (int) c.caclExponencialRecu(5, 2);
                int factorial = (int) c.factorial(5);
                int factorialRec = (int) c.factorialrecu(5);
                System.out.printf("El valor que da al calcular exponencial sin recursividad es: %d\n", exponencial);
                System.out.printf("El valor que da al calcular factorial sin recursividad es: %d\n", factorial);
                System.out.printf("========= Ahora con recursividad =========\n");
                System.out.printf("El valor que da al calcular exponencial con recursividad es: %d\n", exponencialRec);
                System.out.printf("El valor que da al calcular factorial con recursividad es: %d\n", factorialRec);
                
            } else if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Ha "
                        + "seleccionado la opcion de salir, muchas gracias");
            } else {
                JOptionPane.showMessageDialog(null, "Opcion "
                        + "no valida, ingrese otra opcion");
            }
        }
    }
    
}

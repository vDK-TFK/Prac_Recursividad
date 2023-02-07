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
        
        while (opcion != 5){
             opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                     "Ingrese el numero de la opcion que desea escoger: "
                     + "1. Ejercicio 1"
                     + "2. Ejercicio 2"
                     + "3. Ejercicio 3"
                     + "4. Ejercicio 4"
                     + "5. Salir"));
             
             if (opcion == 1){
             } else if (opcion == 2){
                 
             } else if (opcion == 3){
                 
             } else if (opcion == 4){
                 
             } else if (opcion == 5){
                 JOptionPane.showMessageDialog(null, "Ha "
                         + "seleccionado la opcion de salir, muchas gracias");
             } else {
                 JOptionPane.showMessageDialog(null, "Opcion "
                         + "no valida, ingrese otra opcion");
             }
        }
    }
    
}

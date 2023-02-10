/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_recursividad;

/**
 *
 * @author andre
 */
public class Ejercicio3 {
    
    public String identBin(int num){
        
        if (num== 0 || num == 1 || num < 0){
            return "El numero no es binario";
        } else {
            int digito = num%10;
            
            if (digito == 0 || digito == 1){
                identBin(num/10);
                
            }else{
                return "El numero no es binario";
            }
        }
        return "El numero es binario";
    }
    
}

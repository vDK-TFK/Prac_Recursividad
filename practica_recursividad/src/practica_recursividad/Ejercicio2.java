
package practica_recursividad;


public class Ejercicio2 {
    
    public int sumaNumNat(int n){
        if (n == 0){
            return 0;             
        } else{
            return n + sumaNumNat(n-1);
        }
    }
    
}

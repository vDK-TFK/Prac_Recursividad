package practica_recursividad;

public class Ejercicio1 {

    public void vocales(String[] args) {
        String oracion = "Esta es una oracion para que elimine las vocales ";
        String result = quitarvocales(oracion);
        System.out.printf("Oracion original: \n" + oracion);
        System.out.printf("Oracion sin vocales: \n" + result);
    }

    public String quitarvocales(String qVoc) {
        if (qVoc.length() == 0) {
            return qVoc;
        }

        char primerChar = qVoc.charAt(0);
        if (primerChar == 'a' || primerChar == 'e' || primerChar == 'i' || primerChar == 'o' || primerChar == 'u'
                || primerChar == 'A' || primerChar == 'E' || primerChar == 'I' || primerChar == 'O' || primerChar == 'U') {
            return quitarvocales(qVoc.substring(1));
        }

        return primerChar + quitarvocales(qVoc.substring(1));
    }
}

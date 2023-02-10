package practica1ed;

public class main {

    public static void main(String[] args) {
        String cad = "gerald";
        char[] array = cad.toCharArray();
        array = sacarConsonantes(0, ' ', array);
        String string = String.valueOf(array);
        System.out.println(string);
    }

    public static char[] sacarConsonantes(int i, char aux, char[] array) {
        if (i == array.length) {
            return array;
        } else {
            aux = array[i];
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u'
                    || aux == 'A' || aux == 'E' || aux == 'I' || aux == 'O' || aux == 'U') {
                array[i] = ' ';
                return sacarConsonantes(++i, aux = ' ', array);
            } else {
                return sacarConsonantes(++i, aux = ' ', array);
            }
        }
    }
}

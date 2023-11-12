import java.util.Arrays;
import java.util.Scanner;

public class App {
    // Creamos el arreglo y lo inicializamos con 10 posiciones
    private static double[] myArray = { 1.0, 2.5, 3.7, 4.2, 5.8, 6.4, 7.1, 8.9, 9.3, 10.6 };

    // Creamos una variable para la respuesta que nos dara el usuario

    // Creamos el objeto scanner para introducir valores
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Creamoas un while para que se repita la muestra,solictud y cambio del arreglo
        while (true) {
            // Llamamos a esta funcion para mostrar el arreglo
            showArray(myArray);

            // Creamos la varible response para almacenar la funcion ask, abajo te explico
            // que hace la funcion
            char response = ask();

            // SI la respuesta del usuarios es si se realizara la accion, sino se terminara
            // el programa
            if (response == 'Y' || response == 'y') {
                // LLamos a la funcion que va a cambiar los valores del arreglo
                changeArray(myArray);
            } else {
                changeArray(myArray);
                System.out.println("Adios");
                break;
            }
        }
        scanner.close();
    }

    // Mostrar arreglo
    private static void showArray(double[] myArray) {
        // Mostramos el arreglo con la el metodo Array.toString(myArray), ya que si solo
        // ponemos el nombre del array aparecen un hash
        System.out.println("Los valores del arreglo son : " + Arrays.toString(myArray));
    }

    // Funcion que pregunta si quiere modificar el arreglo, y retorna la respuesta
    // en un tipo de dato CHAR
    private static char ask() {
        System.out.println("Quieres modicar alguno elemento del Array? Y/n");
        return scanner.next().charAt(0);

    }

    // Funcion para solicitar la posicion a cambiar y solicitar el valor a cambiar
    private static void changeArray(double[] myArray) {
        // Solicitamos la posicion a cambiar y la guardamos en posicion
        System.out.println("Que posicion quieres  modificar? (0-9)");
        int posicion = scanner.nextInt();

        // Solicitamos el nuevo valor y lo almacenamos
        System.out.println("Por cual valor lo quieres cambiar?");
        double nuevoValor = scanner.nextDouble();

        // Mostramos esta linea para que se vea "MAS BONITO XD"
        System.out.println("-------------------------------------------");
        // Cambias el valor de la posicion que nos dijo el usuario
        myArray[posicion] = nuevoValor;

    }
}

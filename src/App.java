import java.util.Arrays;
import java.util.Scanner;

public class App {
    // Creamos el arreglo y lo inicializamos
    private static double[] myArray = { 1.0, 2.5, 3.7, 4.2, 5.8, 6.4, 7.1, 8.9, 9.3, 10.6 };

    // Creamos una variable para la respuesta que nos dara el usuario

    // Creamos
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (true) {
            showArray(myArray);
            char response = ask();

            if (response == 'Y' || response == 'y') {
                changeArray(myArray);
            } else {
                System.out.println("Adios");
                break;
            }
        }
    }

    // Mostrar arreglo
    private static void showArray(double[] myArray) {
        System.out.println("Los valores del arreglo son : " + Arrays.toString(myArray));
    }

    // Preguntar si quiere modificar el arreglo
    private static char ask() {
        System.out.println("Quieres modicar alguno elemento del Array? Y/n");
        return scanner.next().charAt(0);

    }

    // Cambiar el arreglo
    private static void changeArray(double[] myArray) {
        System.out.println("Que posicion quieres  modificar");
        int posicion = scanner.nextInt();

        System.out.println("Por cual valor lo quieres cambiar?");
        double nuevoValor = scanner.nextDouble();

        System.out.println("-------------------------------------------");
        myArray[posicion] = nuevoValor;

    }
}

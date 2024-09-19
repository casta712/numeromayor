import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Crear el Scanner para leer los números
        Scanner teclado = new Scanner(System.in);

        // Crear un array para almacenar los tres números
        int[] numeros = new int[3];

        // Cargar los números en el array
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite el número " + (i + 1) + ":");
            numeros[i] = teclado.nextInt();
        }

        // Encontrar el mayor número
        int mayor = numeros[0]; // Inicializar el mayor como el primer número
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // Verificar si hay números iguales
        boolean hayIguales = false;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    hayIguales = true;
                    break;
                }
            }
        }

        // Imprimir el resultado
        if (hayIguales) {
            System.out.println("Hay dos o más números iguales.");
        } else {
            System.out.println("El número más grande es: " + mayor);
        }

        // Cerrar el Scanner
        teclado.close();
    }
}

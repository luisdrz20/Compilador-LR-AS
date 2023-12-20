
package Compilador;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Pruebas {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de calificaciones: ");
        int n = scanner.nextInt();
double calificacion;
        // Verificar que el número de calificaciones sea mayor que 0
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número válido de calificaciones mayor que 0.");
            return;
        }

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la calificación #" + i + ": ");
             calificacion = scanner.nextDouble();

            // Verificar que la calificación esté en un rango válido
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("Por favor, ingrese una calificación válida (entre 0 y 100).");
                i--;  // Decrementar i para volver a solicitar la misma calificación.
            } else {
                suma += calificacion;
            }
        }

        double promedio = suma / n;
        System.out.println("El promedio de las " + n + " calificaciones es: " + promedio);

        scanner.close();
    }
}
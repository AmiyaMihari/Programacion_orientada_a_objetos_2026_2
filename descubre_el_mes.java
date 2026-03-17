import java.util.Scanner;

// Programa que identifica el nombre de un mes a partir de un número del 1 al 12

public class descubre_el_mes {

    // Se solicita y retorna el número de mes (entre 1 y 12) ingresado por el usuario
    // Scanner sirve para capturar la entrada del usuario desde la consola
    static int pedirNumero(Scanner entrada) {
        System.out.print("Ingresa un número para identificar el mes (entre 1 y 12): ");
        int numero = entrada.nextInt();
        return numero;
    }

    // Se valida que el número esté dentro del rango permitido (1 a 12)
    // Si el número es válido, se retorna true; si no, se retorna false
    static boolean esValido(int numero) {
        // El número es válido si está entre 1 Y 12
        if (numero >= 1 && numero <= 12) {
            return true;
        } else {
            return false;
        }
    }

    // Se determina y retorna el nombre del mes correspondiente al número recibido
    // Se usa switch para los 12 casos posibles
    static String obtenerNombreMes(int numero) {
        String nombreMes;

        switch (numero) {
            case 1:  nombreMes = "enero";      break;
            case 2:  nombreMes = "febrero";    break;
            case 3:  nombreMes = "marzo";      break;
            case 4:  nombreMes = "abril";      break;
            case 5:  nombreMes = "mayo";       break;
            case 6:  nombreMes = "junio";      break;
            case 7:  nombreMes = "julio";      break;
            case 8:  nombreMes = "agosto";     break;
            case 9:  nombreMes = "septiembre"; break;
            case 10: nombreMes = "octubre";    break;
            case 11: nombreMes = "noviembre";  break;
            case 12: nombreMes = "diciembre";  break;
            // Caso default, en este caso nunca debería de ocurrir, pero es buena pŕactica tenerlo
            default: nombreMes = "desconocido"; break;
        }

        return nombreMes;
    }

    // Se muestra en pantalla el resultado con el formato solicitado
    static void mostrarResultado(int numero, String nombreMes) {
        System.out.println("El mes " + numero + " es " + nombreMes);
    }

    public static void main(String[] args) {
        // Se declara el Scanner como variable local para evitar fugas de recursos
        Scanner entrada = new Scanner(System.in);
        System.out.println("=== Descubre el Mes ===");

        String continuar;

        // El bucle permite al usuario realizar la consulta múltiples veces
        do {
            int numero = pedirNumero(entrada);

            // Se verifica que el número ingresado esté dentro del rango válido
            // Si el número es válido, se obtiene el nombre del mes y se muestra el resultado
            // Si no, se muestra un mensaje de error
            if (esValido(numero)) {
                String nombreMes = obtenerNombreMes(numero);
                mostrarResultado(numero, nombreMes);
            } else {
                System.out.println("¡Número incorrecto!. Ingresa un número entre 1 y 12.");
            }

            System.out.print("¿Deseas intentarlo de nuevo? (s/n): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("¡Gracias por probar el programa!");
        // Se cierra el Scanner para liberar recursos y evitar fugas de memoria
        entrada.close();
    }
}
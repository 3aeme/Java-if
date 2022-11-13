
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoIf2 {

    public static void main(String[] args) {

        System.out.println("Binvenido, desea alquilar una pelicula?");
        System.out.println("De ser asi ingrese 1 si desea reportar una incidencia ingrese 2 de lo contrario ingrese otro numero");
        Scanner consola = new Scanner(System.in);
        int alquilar = consola.nextInt();

        if (alquilar == 1) {
            System.out.println("seleccione su pelicula: 1: volver al futuro; 2: Titanic; 3: Spiderman");
            int pelicula = consola.nextInt();

            switch (pelicula) {
                case 1:
                    System.out.println("Su pelicula es volver al futuro");
                    break;

                case 2:
                    System.out.println("Su pelicula es Titanic");
                    break;

                case 3:
                    System.out.println("Su pelicula es Spiderman");
                    break;

                default:
                    System.out.println("Ingrese 1, 2 o 3");
                    break;
            }
        } else if (alquilar == 2) {
            System.out.println("Si desea devolver la pelicula en la video tienda y presenta algun detalle ingrese 1 de lo contrario ingrese otro numero");
            int retirar = consola.nextInt();
            if (retirar == 1) {
                System.out.println("La informacion fue ingresada, gracias por su preferencia");

            } else {
                System.out.println("Gracias por su preferencia");
            }
        } else {
            System.out.println("Gracias vuelva pronto");
        }

        System.out.println("Gracias por su preferencia");
    }

}

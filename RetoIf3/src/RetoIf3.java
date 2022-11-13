
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoIf3 {

    public static void main(String[] args) {

        System.out.println("Binvenido, desea ver la lista de nuestros productos?");
        System.out.println("De ser asi ingrese 1, para devolucion ingrese 2");
        Scanner consola = new Scanner(System.in);
        int compra = consola.nextInt();

        if (compra == 1) {
            System.out.println("seleccione su producto: 1: Ibuprofeno; 2: Crema para manos; 3: Desodorante");
            int producto = consola.nextInt();
            switch (producto) {
                case 1:
                    System.out.println("Ibuprofeno $200, si desea comprar ingrese 1");
                    int comprar = consola.nextInt();
                    System.out.println("Gracias por su compra");
                    break;

                case 2:
                    System.out.println("Crema para manos $400, si desea comprar ingrese 1");
                    comprar = consola.nextInt();
                    System.out.println("Gracias por su compra");
                    break;

                case 3:
                    System.out.println("desodorante $150, si desea comprar ingrese 1");
                    comprar = consola.nextInt();
                    System.out.println("Gracias por su compra");
                    break;

                default:
                    System.out.println("Ingrese 1, 2 o 3");
                    break;
            }

        }
        if (compra == 2) {
            System.out.println("seleccione el producto que desea devolver: 1: Ibuprofeno; 2: Crema para manos; 3: Desodorante");
            int devo = consola.nextInt();
            switch (devo) {
                case 1:
                    System.out.println("Ibuprofeno se le devuelven $200");
                    System.out.println("Gracias por su preferencia");
                    break;

                case 2:
                    System.out.println("Crema para manos se le devuelven $400");
                    System.out.println("Gracias por su preferencia");
                    break;

                case 3:
                    System.out.println("desodorante se le devuelven $150");
                    System.out.println("Gracias por su preferencia");
                    break;

                default:
                    System.out.println("Ingrese 1, 2 o 3");
                    break;
            }

        }

    }
}

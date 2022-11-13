
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoIf {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var nombre = consola.nextLine();
        System.out.println("Escribe tu apellido");
        var apellido = consola.nextLine();
        System.out.println("Escribe tu edad");
        int edad = consola.nextInt();
        
        if(edad>18){
            System.out.println(nombre + " " + apellido + " " + "usted es mayor de edad, por lo tanto, puede entrar a la fiesta");
        }
        else {
            System.out.println(nombre + " " + apellido + " " + "usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa");
        }
     

    }

}

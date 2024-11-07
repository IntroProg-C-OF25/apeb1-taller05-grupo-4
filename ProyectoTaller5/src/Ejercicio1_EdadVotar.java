import java.util.Scanner;
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        edad = in.nextInt();
        if (edad >= 18)
            System.out.println("Puede votar");
        else
            System.out.println("No puede votar");
    }
}
/***
 * run:
Ingrese la edad: 18
Puede votar
 */

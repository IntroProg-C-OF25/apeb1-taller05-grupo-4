import java.util.Scanner;
public class Ejercicio2_DiaSemana {
    public static void main(String[] args) {
        int numDia;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Deme un numero de dia: ");
        numDia = teclado.nextInt();
        switch(numDia)
        {
            case 1: System.out.println("Lunes");
                    break;
            case 2: System.out.println("Martes");
                    break;
            case 3: System.out.println("Miercoles");
                    break;
            case 4: System.out.println("Jueves");
                    break;
            case 5: System.out.println("Viernes");
                    break; 
            case 6: System.out.println("Sabado");
                    break;
            case 7: System.out.println("Domingo");
                    break;
            default : System.out.println("Error en el numero");
                    
        }
    }
    
}
/***
 * Deme num. de dia: 2
 * Martes
 */


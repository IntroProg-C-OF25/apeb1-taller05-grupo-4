import java.util.Scanner;
public class Ejercicio4_DescuentoCompras {
    public static void main(String[] args) {
        double precioFinal, precioOriginal; 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        precioOriginal = teclado.nextDouble();
        if (precioOriginal >= 100)
        precioFinal = precioOriginal * 0.9;
        else
           precioFinal = precioOriginal;
        System.out.println("El precio total es = " + precioFinal);    
        }
    }
/***
 * Ingrese el precio del producto: 150
 * El precio total es = 135.0
 */
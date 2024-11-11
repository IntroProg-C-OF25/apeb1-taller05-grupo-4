import java.util.Scanner;
public class Ejercicio13_ReservasHoteleras {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);  
       double dias, precio, descuento, subtotal, total;
       System.out.print("Ingrese la cantidad de dias de hospedaje: ");
         dias = in.nextDouble();
       System.out.println("Ingrese el precio por dia de hospedaje: ");
        precio = in.nextDouble(); 
       if (dias > 20)
           descuento = precio * 0.8;
       else
           if (dias > 15)
               descuento = precio * 0.85;
           else
               if (dias > 10)
                   descuento = precio * 0.9;
               else 
                   descuento = 0;
      subtotal = precio - descuento;
       total = dias * (precio - subtotal);
        System.out.println("El total a pagar sera de: " + total);
        System.out.println("El subtotal es de: "+ subtotal);
    }
}

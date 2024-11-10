import java.util.Scanner;
public class Ejercicio12_CalculoImpuestos {
    public static void main(String[] args) {
        String marca, origen;
        double impuestoPagar = 0, costo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la marca del automovil:");
        marca = teclado.nextLine();
        System.out.println("ingrese el origen del automovil(Alemania, Japon, Italia, USA): ");
        origen = teclado.nextLine();
        System.out.println("ingrese el costo del automovil: ");
        costo = teclado.nextDouble();
        if (origen.equals("alemania")){
            impuestoPagar = costo * 0.2;
        }else 
            if (origen.equals("Japon")){
                impuestoPagar = costo * 0.3;
            }else
                if (origen.equals("Italia")){
                    impuestoPagar = costo * 0.15;
                }else
                    if (origen.equals("USA"))
                        impuestoPagar = costo * 0.08;
        double totalPagar = costo + impuestoPagar;
        System.out.println("impuesto a pagar es = " + impuestoPagar);
        System.out.println("El valor del auto mas el impuesto a pagar es = " + totalPagar);
               
    }
    
}

/***
 * ingrese la marca del automovil: toyota
 * ingrese el origen del automovil(Alemania, Japon, Italia, USA): alemania
 * ingrese el costo del automovil: 40000
 * impuesto a pagar es = 8000.0
 * El valor del auto mas el impuesto a pagar es = 48000.0
 */
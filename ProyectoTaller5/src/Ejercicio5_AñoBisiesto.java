import java.util.Scanner;
public class Ejercicio5_AñoBisiesto {
    public static void main(String[] args) {
        int año, añobis;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        año = in.nextInt();
        añobis = año % 4;
        if (añobis == 0)    
            System.out.println("Es un año bisiesto.");
        else
            System.out.println("No es un año bisiesto.");
    }
}

import java.util.Scanner;
public class ejercicio10_FacturacionElectrica {
    public static void main(String[] args) {
        double costoPorKilovatio, kilovaConsu, edad, totalCance;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el costo del kilovatio por hora: ");
        costoPorKilovatio = teclado.nextDouble();
        System.out.print("ingrese los kilovatios consumidos al mes: ");
        kilovaConsu = teclado.nextDouble();
        System.out.print("ingrese su edad: ");
        edad = teclado.nextDouble();
        totalCance = costoPorKilovatio * kilovaConsu;
        if (edad > 65)
            totalCance *= 0.9;
        else
            if (edad < 65)
                totalCance = totalCance;   
        System.out.println("El valor de la planilla es: = " + totalCance );
           
    }
    
}

/***
 * ingrese el costo del kilovatio por hora: 4
 * ingrese los kilovatios consumidos al mes: 5
 * ingrese su edad: 67
 * El valor de la planilla es: = 18.0
 */
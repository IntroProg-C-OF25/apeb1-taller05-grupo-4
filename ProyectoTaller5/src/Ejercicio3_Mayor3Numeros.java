import java.util.Scanner;
public class Ejercicio3_Mayor3Numeros {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        n1 = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        n2 = in.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = in.nextInt();
        if (n1==n2)
            if (n1==n3)
                System.out.println("Los numeros son iguales");
                else
            if (n1>n2)
                if (n1>n3)
                    System.out.println("El numero mayor es: "+ n1);
                else
                    System.out.println("El numero mayor es: "+ n3);
            else
                System.out.println("El numero mayor es: "+ n2);
    }
}

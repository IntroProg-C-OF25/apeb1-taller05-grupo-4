import java.util.Scanner;
public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        double N;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la calificacion: ");
        N = in.nextDouble();
        if (N >= 90)
           System.out.println("La calificacion es A");
        else
            if (N >= 80)
                  System.out.println("La calificacion es B");
            else 
                if (N >= 70)
                    System.out.println("La calificacion es C");
                else
                    if (N >= 60)
                     System.out.println("la calificacion es D");
                    else 
                     System.out.println("La calificacion es E");  
        }
}

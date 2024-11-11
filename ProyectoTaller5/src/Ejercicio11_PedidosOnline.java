import java.util.Scanner;
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        double cant, pu, costT;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad del producto solicitado: ");
        cant = in.nextDouble();
        System.out.print("Ingrese el precio unitario: ");
        pu = in.nextDouble();
        costT = pu * cant;
        if (cant > 50)
            costT = costT * 0.85;
        System.out.println("El costo total es: " + costT);
    }
}

import java.util.Scanner;
public class Ejercicio6_CategoriaEdad {
    public static void main(String[] args) {
        int edad;
        String categoria = "", ninio = "niño", adulto = "adulto", adolescente = "adolescente", adultoM = "Adulto mayor";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
        if (edad >= 3 && edad <= 12) 
            categoria = "niño";
        else 
            if (edad >= 12 && edad <= 18) 
            categoria = "adolescente";
           else 
                if (edad >= 19 && edad <= 60){
                categoria = "adulto";
                }else
                    if (edad >= 61 && edad <= 90){
                        categoria = "Adulto mayor";
                    }else
                        if (edad > 90)
                            categoria = "Numero invalido";
        System.out.println("El usuario es un: " + categoria);
    }
}
/***
 * Ingrese su edad: 8
El usuario es un: niño
 */
import java.util.Scanner;
public class Ejercicio8_CalculadoraImc {
    public static void main(String[] args) {
        double peso, altura, pesoTotal;
        String categoria = "", bajoPeso = "Bajo peso", pesoNormal = "Peso normal", sobrePe = "Sobre peso", obesidad1 = "Obesidad 1", obesidad2 = "Obesidad 2", obesidad3 = "Obesidad 3", numeroIn = "Numero invalido";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el peso en kg: ");
        peso = teclado.nextDouble();
        System.out.println("ingrese la altura en metros: ");
        altura = teclado.nextDouble();
        pesoTotal = peso / (altura * altura);
        if (pesoTotal <= 18.5) {
            categoria = "Bajo peso";
        } else 
            if (pesoTotal > 18.5 && pesoTotal < 24.9){
            categoria = "peso normal";
            }else
                if (pesoTotal >25 && pesoTotal < 29.9){
                    categoria = "Sobre peso";
                }else
                    if (pesoTotal > 30 && pesoTotal < 34.9){
                        categoria = "Obesidad 1";
                    }else
                        if (pesoTotal >35 && pesoTotal < 39.9){
                            categoria = "Obesidad 2";
                        }else
                            if (pesoTotal >40 && pesoTotal < 50){
                                categoria = "Obesidad 3";
                            }else
                                if (pesoTotal > 50)
                                    categoria = "Numero invalido";
        System.out.println("La persona esta en  = " + categoria);

        }

    }

/***
 * Ingrese el peso en kg: 56
 * ingrese la altura en metros: 1,5
 * La persona esta en  = peso normal
 */

package ejercicio04;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner lapiz = new Scanner(System.in);
        double esfero, borrador, papel;
        System.out.println("Ingresar costo por minuto");
        esfero = lapiz.nextDouble();
        System.out.println("Ingresar minutos consumidos");
        borrador = lapiz.nextDouble();
        papel = esfero * borrador;
        System.out.println("El valor que debe pagar por la planilla  es: " + papel + " 1USD");
    }   
}
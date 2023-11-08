package ejercicio06;
import java.util.Scanner;
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner loja = new Scanner(System.in);
        double cuenca, quito, miYantzazaHermoso;
        System.out.println("Ingresar cantidad que desea adquirir al prestamo");
        cuenca = loja.nextDouble();
        System.out.println("Ingresa los meses a pagar");
        quito = loja.nextDouble();
        miYantzazaHermoso = (cuenca/12)+quito;
        System.out.println("El valor mensual a pagar es: " + miYantzazaHermoso);
    }   
}
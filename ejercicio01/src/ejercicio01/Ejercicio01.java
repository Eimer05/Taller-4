package ejercicio01;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double baseTriang;
        double alturaTriang;
        double areaTriang;
        System.out.println("Ingrese la base del triangulo");
        baseTriang = teclado.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        alturaTriang = teclado.nextDouble();
        areaTriang = (baseTriang*alturaTriang)/2;
        System.out.println("El area del triangulo es:" + " " + areaTriang);
    }
    
}

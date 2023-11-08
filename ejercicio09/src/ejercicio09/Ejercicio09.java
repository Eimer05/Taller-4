package ejercicio09;
import java.util.Scanner;
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sida = new Scanner(System.in);
        double herpes, chancro, sifilis, gonorrea, clamidia;
        System.out.println("Ingresa la medida de un lado del cuadrado");
        herpes = sida.nextDouble();
        System.out.println("Ingresa la altura del triangulo");
        chancro = sida.nextDouble();
        sifilis = ((herpes*chancro)/2)*5;
        gonorrea = herpes*herpes;
        clamidia = sifilis + gonorrea;
        System.out.println("El area de ese poligono es: " + clamidia);
    }   
}
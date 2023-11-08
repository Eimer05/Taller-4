package ejercicio05;
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner lamborghini = new Scanner(System.in);
        double ferrari, porsche, BMW, nissan, mercedes;
        System.out.println("Ingresar costo del CPU");
        ferrari = lamborghini.nextDouble();
        System.out.println("Ingresar costo del teclado");
        porsche = lamborghini.nextDouble();
        System.out.println("Ingresar costo del monitor");
        BMW = lamborghini.nextDouble();
        System.out.println("Ingresar costo del raton");
        nissan = lamborghini.nextDouble();
        mercedes = ferrari + porsche + BMW + nissan;
        System.out.println("El total a pagar por todos los componentes es: " + mercedes);

    }   
}
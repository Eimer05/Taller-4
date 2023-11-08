package ejercicio07;
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner kawasaki = new Scanner(System.in);
        double ducati, ktm, honda, yamaha, harleyDavidson;
        System.out.println("Dame el valor del costo por Kilovatio/hora");
        ducati = kawasaki.nextDouble();
        System.out.println("Dame el valor de los kilovatios consumidos en el mes");
        ktm = kawasaki.nextDouble();
        System.out.println("Dame tu edad");
        honda = kawasaki.nextDouble();
        yamaha = ducati*ktm;
        if (honda >= 65) {
            harleyDavidson = yamaha*10/100;
            yamaha = yamaha - harleyDavidson;
            System.out.println("El valor de la planilla es: " + yamaha);  
        }
        else {
        System.out.println("El valor de la planilla es: " + yamaha);
        }
    }   
}
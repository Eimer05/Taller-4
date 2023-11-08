package ejercicio08;
import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner anaconda = new Scanner(System.in);
        double piton, cobra, vibora, culebra, veneno, mamba, cascabel;
        System.out.println("Ingresar el costo de Netflix");
        piton = anaconda.nextDouble();
        System.out.println("Ingresar el costo de Youtube Premium");
        cobra = anaconda.nextDouble();
        System.out.println("Ingresar el costo de Dropbox");
        vibora = anaconda.nextDouble();
        System.out.println("Ingresar el costo de Spotify");
        culebra = anaconda.nextDouble();
        System.out.println("Ingresar tu edad");
        mamba = anaconda.nextDouble();
        veneno = piton + cobra + vibora + culebra;
        if (mamba < 30) {
            cascabel = (veneno * 30/100);
            veneno = veneno - cascabel;
            System.out.println("El valor total a pagar es: "+ veneno);
        }
        else {
            System.out.println("El valor total a pagar es: " + veneno);
        }
    }   
}
package ejercicio03;
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner lechuga = new Scanner(System.in);
        int frijol;
        double tomate;
        System.out.println("Ingresa un nunero entre el 2 y el 6");
        frijol = lechuga.nextInt();
        if (frijol>=2 && frijol<=6){
            tomate = frijol*1;
            System.out.println(frijol + "x 1 = " + tomate);
            tomate = frijol*2;
            System.out.println(frijol + "x 2 = " + tomate);
            tomate = frijol*3;
            System.out.println(frijol + "x 3 = " + tomate);
            tomate = frijol*4;
            System.out.println(frijol + "x 4 = " + tomate);
            tomate = frijol*5;
            System.out.println(frijol + "x 5 = " + tomate);
            tomate = frijol*6;
            System.out.println(frijol + "x 6 = " + tomate);
            tomate = frijol*7;
            System.out.println(frijol + "x 7 = " + tomate);
            tomate = frijol*8;
            System.out.println(frijol + "x 8 = " + tomate);
            tomate = frijol*9;
            System.out.println(frijol + "x 9 = " + tomate);
            tomate = frijol*10;
            System.out.println(frijol + "x 10 = " + tomate);
            tomate = frijol*11;
            System.out.println(frijol + "x 11 = " + tomate);
            tomate = frijol*12;
            System.out.println(frijol + "x 12 = " + tomate);
        }
        else {
            System.out.println("El numero que debe ingresar tiene que ser entre 2 y 6");
        }
    }   
}
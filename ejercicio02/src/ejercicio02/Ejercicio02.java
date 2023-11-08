import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner NutriaSalvaje = new Scanner(System.in);
        double NutriaDomestica, NutriaTrabajadora, NutriaFloja, NutriaCamicasi, NutriaResponsable;
        System.out.println("Dame el valor del costo por Kilovatio/hora");
        NutriaDomestica = NutriaSalvaje.nextDouble();
        System.out.println("Dame el valor de los kilovatios consumidos en el mes");
        NutriaTrabajadora = NutriaSalvaje.nextDouble();
        System.out.println("Dame tu edad");
        NutriaFloja = NutriaSalvaje.nextDouble();
        NutriaCamicasi = NutriaDomestica*NutriaTrabajadora;
        if (NutriaFloja >= 65) {
            NutriaResponsable = NutriaCamicasi*10/100;
            NutriaCamicasi = NutriaCamicasi - NutriaResponsable;
            System.out.println("El valor de la planilla es:" + " " + NutriaCamicasi);  
        }
        else {
            System.out.println("El valor de la planilla es" + " " + NutriaCamicasi);
        }
    }   
}
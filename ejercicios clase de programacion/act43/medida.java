package act43;
import java.util.Scanner;
public class medida {
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        int opc;
        double resul , num1;
        System.out.println("ingresa la opcion que deseas\n" +
                            "\n1: Pulgadas a centímetros " +
                            "\n2: Centimetros a pulgadas");
        opc = num.nextInt();
        switch (opc) {
            case 1:
            System.out.println("Ingresa la cantidad a convertir de Pulgadas a centímetros");
            num1 = num.nextInt();    resul = num1 * 2.5;
            System.out.println("el equbalente a metros es: " + resul);
            break;
            case 2:
            System.out.println("Ingresa la cantidad a convertir de Centimetros a pulgadas");
            num1 = num.nextInt();    resul = num1 / 2.5;
            System.out.println("el equbalente a metros es: " + resul);
            break;
        }
    }
}

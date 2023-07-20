package ac4;

import java.util.Scanner;

public class cfe {
    public static void main(String[] args) {
        int wast;
        double totalW;
        Scanner op  = new Scanner(System.in);
        System.out.println("ingrese la cantidad de wast");
        wast = op.nextInt();
        if (wast >= 1 && wast <= 500){
            totalW = wast * 0.65;
            System.out.println("El total a pagar por el consumo es: " + totalW +
                               "El tipo de consumo es R -> Regular");
        } 
        else if(wast >= 501 && wast <= 1000){
            totalW = wast *     1.23;
            System.out.println("El total a pagar por el consumo es: " + totalW +
                               "\nEl tipo de consumo es N -> Normal");

            }
        else if(wast >= 1001){
            totalW = wast * 1.90;
            System.out.println("El total a pagar por el consumo es: " + totalW +
                               "\nEl tipo de consumo es R -> Excesivo");
                }
    }
}

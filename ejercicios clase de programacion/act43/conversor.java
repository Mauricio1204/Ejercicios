package act43;
import java.util.Scanner;
public class conversor {
    public static void main(String[] args){
        double Dolar = 18.54 , Cdolar , Euro = 20.08 , Ceuros , peso, Cpesos  ;
        int op;
        Scanner var = new Scanner(System.in);
        System.out.println("Ingresa la iocion deseada" +
                            "\n1: Convertir de Dólares a Pesos." +
                            "\n2: Convertir de Pesos a Dólares" +
                            "\n3: Convertir de Euros a Pesos" +
                            "\n4: Convertir de Pesos a Euros" );
        op = var.nextInt();
        switch(op){
            case 1:
            System.out.println("Ingresa la cantidad de dolares a conbertir: ");
            Cdolar = var.nextDouble();
            peso = Cdolar * Dolar;
            System.out.println("la cantidad en pesos es: " + peso);
            break;
            case 2:
            System.out.println("Ingresa la cantidad de pesos a conbertir: ");
            Cpesos = var.nextDouble();
            peso = Dolar / Cpesos;
            System.out.println("la cantidad en pesos es: " + peso);
            break;
            case 3:
            System.out.println("Ingresa la cantidad de euros a conbertir: ");
            Ceuros = var.nextDouble();
            peso = Ceuros * Euro;
            System.out.println("la cantidad en pesos es: " + peso);
            break;
            case 4:
            System.out.println("Ingresa la cantidad de pesos a conbertir: ");
            Ceuros = var.nextDouble();
            peso = Ceuros / Euro;
            System.out.println("la cantidad en pesos es: " + peso);
            break;

        }
    }  
    
}

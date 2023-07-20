package Cronometgro;


import java.util.Scanner;
public class Termometro {
    public static void main (String[] arStrings){
        Scanner num = new Scanner (System.in);
        int opc;
        double resul;
        double num1;
        System.out.println("ingresa la opcion que deseas\n");
        System.out.println(" 1) conbertir de Fahrenheit a CelSius\n 2)convertir de Celsius a Fahrenheit \n 3)convertir de Fahrenheit a Kelvin  \n 4) Convertir de Kelvin a Fahrenheit ");
        opc=num.nextInt();
        switch (opc) {
          case 1: 
                    System.out.println("Ingresa la cantidad a convertir de Fahrenheit a CelSius");
                    num1 = num.nextInt();
                    resul = (num1 -32)/1.8;
                    System.out.println("el equbalente de Fahrenheit a CelSius es: " + resul);
                  break;
          case 2: 
                    System.out.println("Ingresa la cantidad a convertir de Celsius a Fahrenheit");
                    num1 = num.nextInt();
                    resul = (1.8*num1)+32;
                    System.out.println("el equbalente de Celsius a Fahrenheit es: " + resul);
                  break;
          case 3: 
                    System.out.println("Ingresa la cantidad a convertir de Fahrenheit a Kelvin ");
                    num1 = num.nextInt();
                    resul = (num1+459.67)/1.8 ;
                    System.out.println("el equbalente de Fahrenheit a Kelvin es: " + resul);
                  break;
          case 4: 
                  System.out.println("Ingresa la cantidad a convertir de Kelvin a Fahrenheit");
                  num1 = num.nextInt();
                  resul = (((1.82)*num1)-459.67);

                  System.out.println("el equbalente Kelvin a Fahrenheit es: " + resul);
                break;        
          default:
                      System.out.println("no es valida la opcion" );
                   break;
       }
      }
}

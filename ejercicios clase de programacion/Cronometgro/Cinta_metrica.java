package Cronometgro;

import java.util.Scanner;
public class Cinta_metrica {
  public static void main (String[] arStrings){
    Scanner num = new Scanner (System.in);
    int opc;
    double resul , num1;
    System.out.println("ingresa la opcion que deseas\n");
    System.out.println(" 1) Convertir de centímetros a metros.\n 2) Convertir de centímetros a kilómetros.\n  " +
    "3) Convertir de metros a centímetros.\n 4) Convertir de metros a kilómetros.\n 5) Convertir de kilómetros a centímetros.\n 6) Convertir de kilómetros a metros.\n");
    opc=num.nextInt();
    switch (opc) {
      case 1: 
                System.out.println("Ingresa la cantidad a convertir de centímetros a metros");
                num1 = num.nextInt();    resul = num1 * 0.01;
                System.out.println("el equbalente a metros es: " + resul);
              break;
      case 2: 
                System.out.println("Ingresa la cantidad a convertir de centímetros a kilómetros.");
                num1 = num.nextInt();    resul = num1 * 0.00001;
                System.out.println("el equbalente a metros es: " + resul);
              break;
      case 3: 
                System.out.println("Ingresa la cantidad a convertir de metros a centímetros.");
                num1 = num.nextInt();    resul = num1 / 100;
                System.out.println("el equbalente a metros es: " + resul);
              break;
      case 4: 
              System.out.println("Ingresa la cantidad a convertir de metros a kilómetros.");
              num1 = num.nextInt();      resul = num1 /1000 ;
              System.out.println("el equbalente a metros es: " + resul);
            break;
      case 5: 
            System.out.println("Ingresa la cantidad a convertir de kilómetros a centímetros.");
            num1 = num.nextInt();        resul = num1 / 100000;
            System.out.println("el equbalente a metros es: " + resul);
          break;
      case 6: 
          System.out.println("Ingresa la cantidad a convertir de kilómetros a metros.");
          num1 = num.nextInt();          resul = num1 * 1000;
          System.out.println("el equbalente a metros es: " + resul);
        break;     
      default:
                  System.out.println("no es valida la opcion" );
               break;
   }
  }
}

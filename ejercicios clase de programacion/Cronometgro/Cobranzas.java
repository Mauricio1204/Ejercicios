package Cronometgro;


import java.util.Scanner;
public class Cobranzas {
    public static void main (String[] arStrings){
        Scanner num = new Scanner (System.in);
        int opc;
        double montol , pagusu , cambio;
        System.out.println("ingresa la opcion que deseas\n");
        System.out.println("1) CajaResgistradora:\n 2)Descuento: \n 3)Comisión:");
        opc=num.nextInt();
        switch (opc) {
          case 1: 
                        System.out.println("ingrese la cantidad total de la compra");
                        montol = num.nextInt();
                        System.out.println("ingrese la cantidad que pago");
                        pagusu = num.nextInt();
                        cambio = pagusu - montol;
                        System.out.println("el total del cambio es: " + cambio);
                  break;    
          case 2: 
                        System.out.println("ingresa el presio del articulo");
                        montol = num.nextInt();
                        pagusu = montol * 0.12;
                        cambio = montol -pagusu;
                        System.out.println("el total de la comicion es: " + pagusu);
                        System.out.println("el total a pagar es: " + cambio);
                  break;
          case 3: 
                        System.out.println("ingresa el monto de la mensualidad ");
                        montol = num.nextInt();
                        cambio = montol * 0.8;
                        pagusu = cambio + montol;
                        System.out.println("el total de la comicion es: " + cambio);
                        System.out.println("el total a pagar de la mensualidad es: " + pagusu);
                  break;      
          default:
                      System.out.println("no es valida la opcion" );
                   break;
       }
      }       





}

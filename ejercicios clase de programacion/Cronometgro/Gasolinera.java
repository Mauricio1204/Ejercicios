package Cronometgro;

import java.util.Scanner;
public class Gasolinera {
    
    public static void main(String[] args){

             double g = 3.7;
             double pg = 50.875;
             double togas;
             double pgaT;
             double gt;
             
             Scanner gasolina = new Scanner(System.in);
              
             System.out.println("ingresa la cantidad de gasolina");
             togas = gasolina.nextDouble();
             gt = togas * g;
             pgaT = togas * pg;
             System.out.println("el total a pagar es: " + pgaT +"\n el toal de galitos son " + gt );
    }   
}

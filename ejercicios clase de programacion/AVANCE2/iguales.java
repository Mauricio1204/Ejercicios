package AVANCE2;

import java.util.Scanner;

public class iguales {
    public static void main(String []args){
        
        Scanner num = new Scanner (System.in);
        int n1 , n2;
        
        System.out.println("ingres el primer numero ");
        n1=num.nextInt();
        System.out.println("ingres el segundo numero ");
        n2=num.nextInt();
        
        if (n1 == n2){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Distintos");
        }
    } 
}

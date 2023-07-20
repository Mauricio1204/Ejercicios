package AVANCE2;
import java.util.Scanner;

public class Menor_a_10 {
    public static void main(String []args){
        
        Scanner num = new Scanner (System.in);
        int n;
        
        System.out.println("ingres un numero ");
        n=num.nextInt();
        
        if (n < 10){
            System.out.println("Manor a 10");
        }
        else{
            System.out.println("Meyor a 10");
        }
    } 
}

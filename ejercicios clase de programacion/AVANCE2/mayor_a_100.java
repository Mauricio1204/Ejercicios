package AVANCE2;
import java.util.Scanner;
public class mayor_a_100 {

    public static void main(String []args){
        
        Scanner num = new Scanner (System.in);
        int n;
        
        System.out.println("ingres un numero ");
        n=num.nextInt();
        
        if (n > 100){
            System.out.println("Mayor a 100");
        }
        else{
            System.out.println("Menor o igual a 100");
        }
    
}
}

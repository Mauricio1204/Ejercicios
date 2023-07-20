package AVANCE2;
import java.util.Scanner;
public class naturaleza_del_valor {
    public static void main(String []args){
        Scanner num = new Scanner (System.in);
        int n1;
        System.out.println("ingres el primer numero ");
        n1=num.nextInt();
        if (n1 > 0){
            System.out.println("numero positivo");
        }
        else if (n1 == 0){
            System.out.println("numero neutro");
        }else if (n1 < 0){
            System.out.println("numero negativo");
        }
    } 
}

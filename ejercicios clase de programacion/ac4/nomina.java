package ac4;
import java.util.Scanner;
public class nomina {
    public static void main(String[] args) {
        int hrsT, hrsE;
        double salt , Pxh , PxhE, salN ;
        Scanner op = new Scanner(System.in);
        System.out.println("ingresa las horas trabajadas: ");
        hrsT = op.nextInt();
        System.out.println("ingresa la paga por hora: ");
        Pxh = op.nextDouble();
        if (hrsT > 40){
             salt = 40 * Pxh;
             hrsE = hrsT - 40;
             PxhE = (hrsE * Pxh) * 2;
             salN = (40 * Pxh) + PxhE;
            
             System.out.println("\nPago final: " + salN+
                                "\nPago Jornada Normal: " + salt+
                                "\nHoras extras: " + hrsE + 
                                "\nPago por horas extras:" + PxhE);
        }else{
            salt = hrsT * Pxh;
            System.out.println(
                               "\nPago Jornada Normal: " + salt +
                               "\nHoras extras: " + 0 + 
                               "\nPago por horas extras:" + 0 +
                               "\nPago final: " + salt);
        }
    }  
}
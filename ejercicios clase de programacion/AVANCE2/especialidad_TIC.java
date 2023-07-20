package AVANCE2;
import java.util.Scanner;

public class especialidad_TIC {
    public static void main(String []args){
        char a;
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingresa la clave de la carrera: \n");
        a=entrada.next().charAt(0);
        switch (a) {
            case 'S':
            System.out.println("Sistemas Informáticos");
            break;
            case 'R':
            System.out.println("Redes y Telecomunicaciones");
            break;
            case 'D':
            System.out.println("Diseño Digital");
            break;
            default:
            System.out.println("No existe especialidad" );
             break;
        }    
    } 
}

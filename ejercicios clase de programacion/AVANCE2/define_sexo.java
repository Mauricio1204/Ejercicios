package AVANCE2;
import java.util.Scanner;
public class define_sexo {

    public static void main(String []args){
        
        char a;
        Scanner entrada = new Scanner (System.in);

        System.out.println("ingresa tu sexo");
        a=entrada.next().charAt(0);
        switch (a) {
            case 'F':
            System.out.println("Eres Mujer");
            break;
            case 'M':
            System.out.println("eres Hombre ");
            break;
            default:
            System.out.println("Sexo indefinido" );
             break;
        }    
    } 
}

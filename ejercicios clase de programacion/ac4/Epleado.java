package ac4;
import java.util.Scanner;
public class Epleado {
    public static void main(String[] args){
        char s;
        int a , b;
        double salb , c , salt;
        Scanner op = new Scanner(System.in);
        System.out.println("el trabajador tiene oras extra? \n presiona s = si , n = no ");
        s = op.next().charAt(0);
        if ( s == 's'  ){ 
                System.out.println("selecciona la catergoria del empleado para calcular sus horas extra.\n" +
                                      "\ncat 1: 1 h. = 30" +
                                      "\ncat 2: 1 h. = 38" +
                                      "\ncat 3: 1 h. = 50" +
                                      "\ncat 4: 1 h. = 70" +
                                      "\ncat 5: 1 h. = 100");
                                      a = op.nextInt();
                switch (a) {
                                case 1:
                                    System.out.println("ingresa el salario base del trabajador: \n");
                                    salb = op.nextDouble();
                                    System.out.println("ingrese las horas del extra en minutos: \n");
                                    b = op.nextInt();
                                    c = b * 0.5;
                                    salt = salb + c;
                                    System.out.println(" \n el total de las hoas extra son: " + c);
                                    System.out.println(" \n la nomina total es:" + salt);
                                break; 
                                case 2:
                                    System.out.println("ingresa el salario base del trabajador: \n");
                                    salb = op.nextDouble();
                                    System.out.println("ingrese las horas del extra en minutos: \n");
                                    b = op.nextInt();
                                    c = b * 0.6333333333333333;
                                    salt = salb + c;
                                    System.out.println(" \n el total de las hoas extra son: " + c);
                                    System.out.println(" \n la nomina total es:" + salt);
                                
                                break; 
                                case 3:
                                     System.out.println("ingresa el salario base del trabajador: \n");
                                     salb = op.nextDouble();
                                     System.out.println("ingrese las horas del extra en minutos: \n");
                                     b = op.nextInt();
                                     c = b * 0.8333333333333333;
                                     salt = salb + c;
                                     System.out.println(" \n el total de las hoas extra son: " + c);
                                     System.out.println(" \n la nomina total es:" + salt);
                                
                                break; 
                                case 4:
                                    System.out.println("ingresa el salario base del trabajador: \n");
                                    salb = op.nextDouble();
                                    System.out.println("ingrese las horas del extra en minutos: \n");
                                    b = op.nextInt();
                                    c = b * 1.166666666666667;
                                    salt = salb + c;
                                    System.out.println(" \n el total de las hoas extra son: " + c);
                                    System.out.println(" \n la nomina total es:" + salt);
                                
                                break; 
                                case 5:
                                    System.out.println("ingresa el salario base del trabajador: \n");
                                    salb = op.nextDouble();
                                    System.out.println("ingrese las horas del extra en minutos: \n");
                                    b = op.nextInt();
                                    c = b * 1.666666666666667;
                                    salt = salb + c;
                                    System.out.println(" \n el total de las hoas extra son: " + c);
                                    System.out.println(" \n la nomina total es:" + salt);   
                                break;                
                                default:
                                    System.out.println("no es valida la opcion" );
                                break;
                }
        }
        else if ( s =='n'){
            System.out.println("solo pagu el salario normal sin horas extra.");
        }
    } 
}

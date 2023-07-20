package act43;
import java.util.Scanner;
public class areas {
    public static void main(String[] args) {
        int c;
        double h, b, a,pi=3.1416, resul  ;
        Scanner op = new Scanner(System.in);
        System.out.println("selecciona la catergoria del empleado para calcular sus horas extra.\n" +
                                      "\ncat 1: Calcular el área de un cuadrado." +
                                      "\ncat 2: Calcular el área de un rectangulo." +
                                      "\ncat 3: Calcular el área de un triángulo." +
                                      "\ncat 4: Calcular el área de un círculo." +
                                      "\ncat 5: Calcular el área de un cilindro."+
                                      "\ncat 6: Calcular el área de un cilindro." );
                                      c = op.nextInt();
                switch (c) {            case 1:
                                        System.out.println("ingresa base: ");
                                        b = op.nextDouble();
                                        System.out.println("ingresa la altura: ");
                                        a = op.nextDouble();
                                        resul = a * b;
                                        System.out.println("el el area del cuadrado es: " + resul);
                                break;  case 2:
                                        System.out.println("ingresa base: ");
                                        b = op.nextDouble();
                                        System.out.println("ingresa la altura: ");
                                        a = op.nextDouble();
                                        resul = a * b;
                                        System.out.println("el el area del rectangulo es: " + resul);                      
                                break;  case 3:
                                        System.out.println("ingresa base: ");
                                        b = op.nextDouble();
                                        System.out.println("ingresa la altura: ");
                                        a = op.nextDouble();
                                        resul = (a * b) / 2;
                                        System.out.println("el el area del triángulo es: " + resul);
                                break;  case 4:
                                        System.out.println("ingresa el radio: ");
                                        b = op.nextDouble();
                                        resul = pi * (b * b);
                                        System.out.println("el el area del circulo es: " + resul);
                                break;  case 5:
                                        System.out.println("ingresa el radio: ");
                                        b = op.nextDouble();
                                        System.out.println("ingresa la altura: ");
                                        a = op.nextDouble();
                                        resul = 2 * (pi * b) * a;
                                        System.out.println("el el area del cilindro es: " + resul);
                                
                                break;  case 6:
                                        System.out.println("ingresa el radio: ");
                                        b = op.nextDouble();
                                        System.out.println("ingresa la altura: ");
                                        a = op.nextDouble();
                                        resul = pi * (b * b) * a;
                                        System.out.println("el el volumen del cilindro es: " + resul);
                                break;  default:
                                    System.out.println("no es valida la opcion" );
                                break; }  } }

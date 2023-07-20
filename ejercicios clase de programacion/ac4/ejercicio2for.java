package ac4;
import java.util.Scanner;
public class ejercicio2for {
            public static void main(String[] args){
                int n,b,s;
                Scanner op = new Scanner(System.in);
                //System.out.println("ingresa la tabla de multiplicar: ");
                //n = op.nextInt();
                System.out.println("ingresa la tabla de multiplicar: ");
               // b = op.nextInt();
               // System.out.println("ingresa la tabla de multiplicar: ");
               // s = op.nextInt();
                ejercicio2for c = new ejercicio2for();
                //c.repite();
                //c.repite1();
                //c.repite2(n);
                //c.repite3 (b,s);
            }
                 void repite (){ 
                 int a;
                 for (a = 0 ; a < 40; ) {
                     a = a + 2;
                     System.out.println( a );
                      
                     } 
                      }
                 void repite1 (){ 
                    int a;
                    for (a = 100 ; a  >= 70; a-- ) {
                        
                        System.out.println( a );
                         
                        } 
                         }
                 void repite2 (int n){ 
                    
                    for (int i = 0 ; i  <= 10; i++ ) {
                        int  result;
                        result = n * i;
                        System.out.println( n + "X"+ i + "="+ result );
                        } 
                         }
                 void repite3 (int  b , int s){ 
                    int max,min;
                    min = Math.min(s,b); 
                    max=Math.max(s,b);
                    System.out.println("Maximo: "+ max + " Minimo: " + min );
                    for ( int i = min; i <= max; i++ ) {
                        System.out.println(i);
                        } 
                         }

}

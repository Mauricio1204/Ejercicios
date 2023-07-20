package ac4;

import java.util.Scanner;

public class ejercico2while {
    
         public static void main(String[] args){
             int n,b,s;
             Scanner op = new Scanner(System.in);
             //System.out.println("ingresa la tabla de multiplicar: ");
             //n = op.nextInt();
             System.out.println("ingresa la tabla de multiplicar: ");
             b = op.nextInt();
             System.out.println("ingresa la tabla de multiplicar: ");
             s = op.nextInt();
             ejercico2while c = new ejercico2while();
           
             //c.repite_while ();
             //c.repite_while1 ();
             //c.repite_while2(n);
             c.repite_while3 (b,s);


         }

                void repite_while(){
                     int a = 0;
                     while(a < 40)         {
                        a = a + 2;
                        System.out.println( a  );
                        
                    
                    }
                }
                void repite_while1(){
                    int a  = 100;
                    while(a  >= 70)         {
                        System.out.println( a );
                       a--;
                   
                   }
               }
               void repite_while2(int n){
                int i = 0, result;
                while( i  <= 10)      {
                    result = n * i;
                    System.out.println( n + "X"+ i + "="+ result );
                    i++;
                  }
               }
               void repite_while3(int  b , int s){
                int max,min;
                    min = Math.min(s,b); 
                    max=Math.max(s,b);
                    int i = min;
                    System.out.println("Maximo: "+ max + " Minimo: " + min );
                while(i <= max ) {
                    System.out.println(i);
                    i++;
                  }
               }


    }


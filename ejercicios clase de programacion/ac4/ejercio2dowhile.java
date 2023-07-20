package ac4;

import java.util.Scanner;

public class ejercio2dowhile {
    public static void main(String[] args){
        int n,b,s;
        Scanner op = new Scanner(System.in);
        ejercio2dowhile c = new ejercio2dowhile();
        //System.out.println("ingresa la tabla de multiplicar: ");
        //n = op.nextInt();
        System.out.println("ingresa un nomero: ");
        b = op.nextInt();
        System.out.println("ingresa un nomero: ");
        s = op.nextInt();
        c. repite_while3(b,s);        
    }
            void repite_while(){
                 int a = 0; 
                 do{
                         a = a + 2;
                         System.out.println( a );
                   }while(a < 40);
                              }
            void repite_while1(){
                int a = 100; 
                do{   
                         System.out.println( a );
                         a--;
                  }while(a  >= 70);
                             }
            void repite_while2(int n){
               int i = 0; 
               do{
                        int  result;
                        result = n * i;
                        System.out.println( n + "X"+ i + "="+ result );
                        i++;
                 }while(i  <= 10);
                }
            void repite_while3(int  b , int s){
                int max,min;
                min = Math.min(s,b); 
                max=Math.max(s,b);
                System.out.println("Maximo: "+ max + " Minimo: " + min );
                int i = min; 
                do{
                    System.out.println(i);
                         i++;
                  }while(i <= max);
                 }          
}
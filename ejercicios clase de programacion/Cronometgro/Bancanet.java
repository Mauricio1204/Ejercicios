package Cronometgro;

import java.util.Scanner;
public class Bancanet {
    public static void main(String[] args){
        
        double Dolar = 20.99 , Cdolar , Euro = 23.78 , Ceuros , peso;

        Scanner var = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de dolares a conbertir: ");
        Cdolar = var.nextDouble();
        peso = Cdolar * Dolar;
        Ceuros = peso / Euro;
        System.out.println("\nLa cantidad de dolares a conbertir es: " + Cdolar +
                           "\nLa cantidad en pesos es: " + peso +
                           "\nLa cantidad en euros es: " + Ceuros); 
    }  
}

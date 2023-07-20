package Cronometgro;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args){

        int Ndias , seg , hrs , min ;
        Scanner var = new Scanner(System.in);
        System.out.println("ingresa la cantidad de dias a conbertir");
        Ndias = var.nextInt();
        hrs = Ndias * 24;
        min = hrs * 60;
        seg= min *60;
        System.out.println( " \nEl total de dias son: " + Ndias + 
                            " \nEl total de horas: " + hrs + 
                            " \nEl total de minutos son: " + min +
                            " \nEl total de segundos: " + seg );
    }   
}

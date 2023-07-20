package Cronometgro;

import java.util.Scanner;
public class Cursos {
    
    public static void main(String[] args){

        double prcur , Tcuso , desc , PFcuso;
        int canper;

        Scanner curso = new Scanner(System.in);

        System.out.println("ingresa la cantidad por persona: ");
        prcur = curso.nextDouble();
        System.out.println("ingresa la cantidad de personas que ingresaran al curso: ");
        canper = curso.nextInt();
        Tcuso = prcur * canper;
        desc = Tcuso * 0.12;
        PFcuso = Tcuso - desc;

        System.out.println("el total pagado es: " + Tcuso +
                           "\n el descuento total es: " + desc +
                            " \nel pago final es de: " + PFcuso );
    }
}


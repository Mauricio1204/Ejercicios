package ac4;

import java.util.Scanner;

public class HOSPITAL {
        public static void main(String[] args) {
            String nombre, enfermedad;
            char sexo;
            int edad , DiasInternados,Tenfermedad;
            double iva , Presupuest , Presupuesto;
            
            Scanner opc = new Scanner(System.in);
            System.out.println("\nIngresa el nombre del paciente");
            nombre = opc.nextLine();
            System.out.println("\nIngrese la enfemedado del paciente");
            enfermedad = opc.nextLine();
            System.out.println("\nIngresa la edad del paciente");
            edad = opc.nextInt();
            
            System.out.println("\nIngrese la tipo de enfemedado del paciente" +
                                  "\nTipo 1: Cuadro básico:  "+
                                  "\nTipo 2: Primarias"+
                                  "\nTipo 3: Secundarias"+
                                  "\nTipo 4: Terminales");
            Tenfermedad = opc.nextInt();
            System.out.println("\nIngrese los dias previstos a estar internado");
            DiasInternados = opc.nextInt();
            System.out.println("\nIngerese el sexso del pasiente \nF-> Femenino\nM-> Masculino");
            sexo = opc.next().charAt(0);

            if (edad != 0 && DiasInternados != 0) {
                if (edad >= 1 && edad <=130) {
                    if ( edad >= 14 && edad <=32 ){
                        switch  (Tenfermedad){
                                                case 1:
                                                        switch (sexo){
                                                                        case 'F':
                                                                        Presupuesto = DiasInternados * 200;
                                                                        iva = Presupuesto * 0.10;
                                                                        Presupuest = iva + Presupuesto ; 
                                                                        System.out.println("\n Nombre: " + nombre +
                                                                                           "\n Sexo: M - Masculino " +
                                                                                           "\n Edad: " + edad +
                                                                                           "\nEnfermedad: " + enfermedad +
                                                                                           "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                           "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                           "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                           "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                        break;
                                                                        case 'M':
                                                                        Presupuesto = DiasInternados * 200;
                                                                        iva = Presupuesto * 0.10;
                                                                        Presupuest = iva + Presupuesto ; 
                                                                        System.out.println("\n Nombre: " + nombre +
                                                                                           "\n Sexo: M - Masculino " +
                                                                                           "\n Edad: " + edad +
                                                                                           "\nEnfermedad: " + enfermedad +
                                                                                           "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                           "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                           "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                           "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                        break;
                                                                   }
                                                break;
                                                case 2:
                                                     switch (sexo){
                                                                            case 'F':
                                                                            Presupuesto = DiasInternados * 200;
                                                                            iva = Presupuesto * 0.10;
                                                                            Presupuest = iva + Presupuesto ; 
                                                                            System.out.println("\n Nombre: " + nombre +
                                                                                               "\n Sexo: M - Masculino " +
                                                                                               "\n Edad: " + edad +
                                                                                               "\nEnfermedad: " + enfermedad +
                                                                                               "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                               "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                               "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                               "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                             break;
                                                                             case 'M':
                                                                             Presupuesto = DiasInternados * 260;
                                                                             iva = Presupuesto * 0.10;
                                                                             Presupuest = iva + Presupuesto ; 
                                                                             System.out.println("\n Nombre: " + nombre +
                                                                                                  "\n Sexo: M - Masculino " +
                                                                                                  "\n Edad: " + edad +
                                                                                                  "\nEnfermedad: " + enfermedad +
                                                                                                  "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                                  "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                                  "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                                  "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                             break;
                                                                      }
                                                break;
                                                case 3:
                                                         switch (sexo){
                                                                             case 'F':
                                                                             Presupuesto = DiasInternados * 200;
                                                                             iva = Presupuesto * 0.10;
                                                                             Presupuest = iva + Presupuesto ; 
                                                                             System.out.println("\n Nombre: " + nombre +
                                                                                                "\n Sexo: M - Masculino " +
                                                                                                "\n Edad: " + edad +
                                                                                                "\nEnfermedad: " + enfermedad +
                                                                                                "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                                "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                                "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                                "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                             break;
                                                                             case 'M':
                                                                             Presupuesto = DiasInternados * 485;
                                                                             iva = Presupuesto * 0.10;
                                                                             Presupuest = iva + Presupuesto ; 
                                                                             System.out.println("\n Nombre: " + nombre +
                                                                                                "\n Sexo: M - Masculino " +
                                                                                                "\n Edad: " + edad +
                                                                                                "\nEnfermedad: " + enfermedad +
                                                                                                "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                                "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                                "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                                "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                             break;
                                                                      }
                                                break;
                                                case 4:
                                                        switch (sexo){
                                                                            case 'F':
                                                                            Presupuesto = DiasInternados * 200;
                                                                            iva = Presupuesto * 0.10;
                                                                            Presupuest = iva + Presupuesto ; 
                                                                            System.out.println("\n Nombre: " + nombre +
                                                                                               "\n Sexo: M - Masculino " +
                                                                                               "\n Edad: " + edad +
                                                                                               "\nEnfermedad: " + enfermedad +
                                                                                               "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                               "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                               "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                               "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                            break;
                                                                            case 'M':
                                                                            Presupuesto = DiasInternados * 1000;
                                                                            iva = Presupuesto * 0.10;
                                                                            Presupuest = iva + Presupuesto ; 
                                                                            System.out.println("\n Nombre: " + nombre +
                                                                                               "\n Sexo: M - Masculino " +
                                                                                               "\n Edad: " + edad +
                                                                                               "\nEnfermedad: " + enfermedad +
                                                                                               "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                               "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                               "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                               "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                              break;
                                                                     }

        
                        }
                    
                      }
                 else if (edad >= 1 && edad <=130){
                        switch  (Tenfermedad){
                                                case 1:
                                                         switch (sexo){
                                                                        case 'F':
                                                                        Presupuesto = DiasInternados * 200;
                                                                        iva = 0;
                                                                        Presupuest = iva + Presupuesto ; 
                                                                        System.out.println("\n Nombre: " + nombre +
                                                                                           "\n Sexo: M - Masculino " +
                                                                                           "\n Edad: " + edad +
                                                                                           "\nEnfermedad: " + enfermedad +
                                                                                           "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                           "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                           "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                           "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                        break;
                                                                        case 'M':
                                                                        Presupuesto = DiasInternados * 200;
                                                                        iva = 0;
                                                                        Presupuest = iva + Presupuesto ; 
                                                                        System.out.println("\n Nombre: " + nombre +
                                                                                           "\n Sexo: M - Masculino " +
                                                                                           "\n Edad: " + edad +
                                                                                           "\nEnfermedad: " + enfermedad +
                                                                                           "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                           "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                           "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                           "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                        break;
                                                                     }
                                                    break;
                                                    case 2:
                                                            switch (sexo){
                                                                            case 'F':
                                                                            Presupuesto = DiasInternados * 200;
                                                                            iva = 0;
                                                                            Presupuest = iva + Presupuesto ; 
                                                                            System.out.println("\n Nombre: " + nombre +
                                                                                               "\n Sexo: M - Masculino " +
                                                                                               "\n Edad: " + edad +
                                                                                               "\nEnfermedad: " + enfermedad +
                                                                                               "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                               "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                               "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                               "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                            break;
                                                                            case 'M':
                                                                            Presupuesto = DiasInternados * 260;
                                                                            iva = 0;
                                                                            Presupuest = iva + Presupuesto ; 
                                                                            System.out.println("\n Nombre: " + nombre +
                                                                                               "\n Sexo: M - Masculino " +
                                                                                               "\n Edad: " + edad +
                                                                                               "\nEnfermedad: " + enfermedad +
                                                                                               "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                               "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                               "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                               "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                            break;
                                                                          }                                                       
                                                     break;
                                                     case 3:
                                                            switch (sexo){
                                                                                case 'F':
                                                                                Presupuesto = DiasInternados * 200;
                                                                                iva = 0;
                                                                                Presupuest = iva + Presupuesto ; 
                                                                                System.out.println("\n Nombre: " + nombre +
                                                                                                   "\n Sexo: M - Masculino " +
                                                                                                   "\n Edad: " + edad +
                                                                                                   "\nEnfermedad: " + enfermedad +
                                                                                                   "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                                   "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                                   "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                                   "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                                break;
                                                                                case 'M':
                                                                                Presupuesto = DiasInternados * 485;
                                                                                iva = 0;
                                                                                Presupuest = iva + Presupuesto ; 
                                                                                System.out.println("\n Nombre: " + nombre +
                                                                                                   "\n Sexo: M - Masculino " +
                                                                                                   "\n Edad: " + edad +
                                                                                                   "\nEnfermedad: " + enfermedad +
                                                                                                   "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                                   "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                                   "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                                   "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                                break;
                                                                     }                               
                                                     break;
                                                     case 4:
                                                             switch (sexo){
                                                                             case 'F':
                                                                             Presupuesto = DiasInternados * 200;
                                                                             iva = 0;
                                                                             Presupuest = iva + Presupuesto ; 
                                                                             System.out.println("\n Nombre: " + nombre +
                                                                                                "\n Sexo: M - Masculino " +
                                                                                                "\n Edad: " + edad +
                                                                                                "\nEnfermedad: " + enfermedad +
                                                                                                "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                                "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                                "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                                "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                             break;
                                                                             case 'M':
                                                                             Presupuesto = DiasInternados * 1000;
                                                                             iva = 0;
                                                                             Presupuest = iva + Presupuesto ; 
                                                                             System.out.println("\n Nombre: " + nombre +
                                                                                                "\n Sexo: M - Masculino " +
                                                                                                "\n Edad: " + edad +
                                                                                                "\nEnfermedad: " + enfermedad +
                                                                                                "\n Tipo: " + Tenfermedad + "-Cuadro básico: " +
                                                                                                "\n Dias de hospitalizacion: " + DiasInternados + 
                                                                                                "\n Presupuesto estimado: " + Presupuesto + " +  " + 
                                                                                                "Factor edad: " + iva + "-Total: " + Presupuest);
                                                                             break;
                                                                           }
            }
                }
                }  
            }else{
                System.out.println("Ingresa los datos faltantes porfabor");
            }
        }
}

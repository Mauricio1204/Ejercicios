package ac4;
import java.util.Scanner;
public class trabajador {
    public static void main(String[] args){
            String nom ;
            int b, c , s;
            double vales , suel , selt, valesT, Isuel, Ivales, Total, NTotal;
            Scanner op  = new Scanner(System.in);
            System.out.println("ingresa el nombre del trabajador");
            nom = op.nextLine();
            System.out.println("ingresa el numero del trabajador");
            b = op.nextInt();  
            System.out.println("ingresa el sueldo del trabajador");
            suel = op.nextDouble();
            System.out.println("ingresa el monto de vales");
            vales = op.nextDouble();
                    if (suel > 0 && vales > 0) {
                            System.out.println("ingresa la clave del puesto de trabajo" +
                                                "\n 1: PTC -> Prof. de Tiempo Completo " +
                                                "\n 2: PA -> Prof. de Asignatura " +
                                                "\n 3: TA -> Técnico de Apoyo " +
                                                "\n 2: SC -> Secretarias "  );
                            s = op.nextInt();
                             switch (s) {
                                 case 1:
                                 Isuel = suel * 0.15;
                                 selt = Isuel + suel;
                                 Ivales = vales * 0.5;
                                 valesT = vales + Ivales;
                                 Total = suel + vales;
                                 NTotal = selt + valesT;
                                 System.out.println("Puesto: Prof. de Tiempo Completo"+
                                                    "\nColaborador:" + b + " - " + nom +
                                                    "\nSueldo Mensual Actual: " + suel + 
                                                    "\nIncremento Salarial Asignado:" + Isuel +
                                                    "\nNuevo Sueldo Mensual:" + selt +
                                                    "\nPercepción Vales de despensa Actual: " + vales + " Incremento Vales: " + Ivales +
                                                    "\nNuevo Monto en Vales: " + valesT +
                                                    "\nPercepción Total Actual: Suma (Sueldo Mensual Actual + Percepción Vales Actual): " + Total +
                                                    "\nNueva Percepción Total: Suma (Nuevo Sueldo Mensual + Nueva Percepción Vales): " + NTotal );
                                 break;
                                 case 2:
                                 Isuel = suel * 0.10;
                                 selt = Isuel + suel;
                                 Ivales = vales * 0.3;
                                 valesT = vales + Ivales;
                                 Total = suel + vales;
                                 NTotal = selt + valesT;
                                 System.out.println("Puesto: Prof. de Asignatura"+
                                                    "\nColaborador:" + b + " - " + nom +
                                                    "\nSueldo Mensual Actual: " + suel + 
                                                    "–Incremento Salarial Asignado:" + Isuel +
                                                    "\nNuevo Sueldo Mensual:" + selt +
                                                    "\nPercepción Vales de despensa Actual: " + vales + " Incremento Vales: " + Ivales +
                                                    "\nNuevo Monto en Vales: " + valesT +
                                                    "\nPercepción Total Actual: Suma (Sueldo Mensual Actual + Percepción Vales Actual): " + Total +
                                                    "\nNueva Percepción Total: Suma (Nuevo Sueldo Mensual + Nueva Percepción Vales): " + NTotal );
                                 break;
                                 case 3:
                                 Isuel = suel * 0.8;
                                 selt = Isuel + suel;
                                 Ivales = vales * 0.2;
                                 valesT = vales + Ivales;
                                 Total = suel + vales;
                                 NTotal = selt + valesT;
                                 System.out.println("Puesto: Técnico de Apoyo"+
                                                    "\nColaborador:" + b + " - " + nom +
                                                    "\nSueldo Mensual Actual: " + suel + 
                                                    "–Incremento Salarial Asignado:" + Isuel +
                                                    "\nNuevo Sueldo Mensual:" + selt +
                                                    "\nPercepción Vales de despensa Actual: " + vales + " Incremento Vales: " + Ivales +
                                                    "\nNuevo Monto en Vales: " + valesT +
                                                    "\nPercepción Total Actual: Suma (Sueldo Mensual Actual + Percepción Vales Actual): " + Total +
                                                    "\nNueva Percepción Total: Suma (Nuevo Sueldo Mensual + Nueva Percepción Vales): " + NTotal );
                                 break;
                                 case 4:
                                 Isuel = suel * 0.7;
                                 selt = Isuel + suel;
                                 Ivales = vales * 0.2;
                                 valesT = vales + Ivales;
                                 Total = suel + vales;
                                 NTotal = selt + valesT;
                                 System.out.println("Puesto: Secretaria"+
                                                    "\nColaborador:" + b + " - " + nom +
                                                    "\nSueldo Mensual Actual: " + suel + 
                                                    "–Incremento Salarial Asignado:" + Isuel +
                                                    "\nNuevo Sueldo Mensual:" + selt +
                                                    "\nPercepción Vales de despensa Actual: " + vales + " Incremento Vales: " + Ivales +
                                                    "\nNuevo Monto en Vales: " + valesT +
                                                    "\nPercepción Total Actual: Suma (Sueldo Mensual Actual + Percepción Vales Actual): " + Total +
                                                    "\nNueva Percepción Total: Suma (Nuevo Sueldo Mensual + Nueva Percepción Vales): " + NTotal );
                                 break;
        }    
                    }else {
                        System.out.println("Ingresa los datos correctos");
                    }
    }
    
}

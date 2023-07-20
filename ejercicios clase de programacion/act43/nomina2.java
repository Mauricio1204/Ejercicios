package act43;
import java.util.Scanner;
public class nomina2 {
    public static void main(String[] args){ 
        String s,nom, puesto ,area;
        int matricula;
        double sal , salt , salr, salf;
        Scanner op = new Scanner(System.in);
        System.out.println("Ingresa el nomre del del trabajador: ");
        nom = op.nextLine();
        System.out.println("Ingresa la matricula del trabajador: ");
        matricula = op.nextInt();
        System.out.println("Ingresa el sexo del trabajador: ");
        s = op.nextLine();
        System.out.println("Ingresa el salario quinsenal: ");
        sal = op.nextDouble();
        System.out.println("Ingresa el puesto del trabajador: ");
        puesto = op.nextLine();
        System.out.println("Ingresa el area de trabajo: ");
        area = op.nextLine();
        if (sal > 4000) {
            salt = sal + sal ;
            salr = salt * 0.5;
            salf = salt - salr;
            System.out.println("\n No. empleado: " + matricula +
                               "\n Nombre: " + nom +
                               "\n Sexo: " + s + 
                               "\n Puesto: " + area +
                               "\n Área: " + puesto +
                               "\n Sueldo Quincenal: " + sal + 
                               "\n Sueldo Mensual: "+ salt +
                               "\n Sueldo Retenido:" + salr+
                               "\n Sueldo Final:" +salf );
        }else if (sal > 4000 && sal < 6000) {
            salt = sal + sal ;
            salr = salt * 0.7;
            salf = salt - salr;
            System.out.println("\n No. empleado: " + matricula +
                               "\n Nombre: " + nom +
                               "\n Sexo: " + s + 
                               "\n Puesto: " + area +
                               "\n Área: " + puesto +
                               "\n Sueldo Quincenal: " + sal + 
                               "\n Sueldo Mensual: "+ salt +
                               "\n Sueldo Retenido:" + salr+
                               "\n Sueldo Final:" +salf );
        }else if (sal > 6000 && sal <= 10000){
            salt = sal + sal ;
            salr = salt * 0.10;
            salf = salt - salr;
            System.out.println("\n No. empleado: " + matricula +
                               "\n Nombre: " + nom +
                               "\n Sexo: " + s + 
                               "\n Puesto: " + area +
                               "\n Área: " + puesto +
                               "\n Sueldo Quincenal: " + sal + 
                               "\n Sueldo Mensual: "+ salt +
                               "\n Sueldo Retenido:" + salr+
                               "\n Sueldo Final:" +salf );

        }else if (sal > 10000){       
            salt = sal + sal ;
            salr = salt * 0.15;
            salf = salt - salr;
            System.out.println("\n No. empleado: " + matricula +
                               "\n Nombre: " + nom +
                               "\n Sexo: " + s + 
                               "\n Puesto: " + area +
                               "\n Área: " + puesto +
                               "\n Sueldo Quincenal: " + sal + 
                               "\n Sueldo Mensual: "+ salt +
                               "\n Sueldo Retenido:" + salr+
                               "\n Sueldo Final:" +salf );
    }else {
        System.out.println("verifica los datos");
    }
    }
}
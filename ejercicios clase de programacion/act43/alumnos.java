package act43;
import java.util.Scanner;
public class alumnos {
            public static void main(String[] args) {
                    String nom, carrera, asignaura ;
                    int matricula;
                    double pro, c1,c2,c3;
                    Scanner op = new Scanner(System.in);
                    System.out.println("Ingresa el nomre del estudiante: ");
                    nom = op.nextLine();
                    System.out.println("Ingresa la matricula del estudiante: ");
                    matricula = op.nextInt();
                    System.out.println("Ingresa la primera calificacion del estudiante: ");
                    c1 = op.nextDouble();
                    System.out.println("Ingresa la segunda calificacion del estudiante:");
                    c2 = op.nextDouble();
                    System.out.println("Ingresa la tercera calificacion del estudiante");
                    c3 = op.nextDouble();
                    System.out.println("Ingresa la asignaura ");
                    asignaura = op.nextLine();
                    System.out.println("Ingresa la carrera");
                    carrera = op.nextLine();
                    if (c1 > 0 && c1 <= 10 && c2 > 0 && c2 <= 10 && c3 > 0 && c3 <= 10){
                        pro = ((c1 + c2 + c3)/ 3);
                            if (pro >= 8){
                                System.out.println("\n Matrícula: " + matricula +
                                                   "\n Alumno: " + nom + 
                                                   "\n Especialidad: " + carrera +
                                                   "\n Asignatura: " + asignaura +
                                                   "\nPrimer Parcial: " + c1 +"\nSegundo Parcial: "+ c2 +"\nTercer Parcial: " + c3 +
                                                   "\n Promedio: " + pro +
                                                   "\n Estatus de Evaluación: Aprovado"   );
                            } else if (pro <= 8){
                                System.out.println("\n Matrícula: " + matricula +
                                                   "\n Alumno: " + nom + 
                                                   "\n Especialidad: " + carrera +
                                                   "\n Asignatura: " + asignaura +
                                                   "\nPrimer Parcial: " + c1 + "\nSegundo Parcial: "+ c2 + "\nTercer Parcial: " + c3 +
                                                   "\n Promedio: " + pro +
                                                   "\n Estatus de Evaluación: reprovado" );
                            }
                    }else {
                        System.out.println("verifica las calificaciones");
                    }
            }
}
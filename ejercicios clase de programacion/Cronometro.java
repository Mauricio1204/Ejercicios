import java.util.Scanner;

public class Cronometro{

	public static void main(String[] args){

		Scanner leer= new Scanner(System.in);
		int opcion;
		int seg, hor, min, r;

		System.out.println("seleccione el tiempo de convercion");
		System.out.println("1. Segundos a Minutos");
		System.out.println("2. Segundos a horas");
		System.out.println("3. Minutos a Segundos");
		System.out.println("4. Minutos a Horas");
		System.out.println("5. Horas a Segundos");
		System.out.println("6. Horas a Minutos");

		opcion=leer.nextInt();

		switch(opcion){

			case 1:
			System.out.println("ingrese los segundos ");
			seg= leer.nextInt();
			r=seg/60;
			System.out.println("El resultado es: "+ r +"Minutos");
			break;

			case 2:
			System.out.println("ingrese los segundos ");
			seg= leer.nextInt();
			r=seg/3600;
			System.out.println("El resultado es: "+ r +"Horas");
			break;

			case 3:
			System.out.println("ingrese los minutos ");
			min= leer.nextInt();
			r=min*60;
			System.out.println("El resultado es: "+ r +"Segundos");
			break;

			case 4:
			System.out.println("ingrese los minutos ");
			min= leer.nextInt();
			r=min/60;
			System.out.println("El resultado es: "+ r +"Horas");
			break;

			case 5:
			System.out.println("ingrese las horas ");
			hor= leer.nextInt();
			r=hor*3600;
			System.out.println("El resultado es: "+ r +"Segundos");
			break;

			case 6:
			System.out.println("ingrese los Horas ");
			hor= leer.nextInt();
			r=hor*60;
			System.out.println("El resultado es: "+ r +"Minutos");
			break;

		}
	}
} //FIN :3
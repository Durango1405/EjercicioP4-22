package Actividad2;

import java.util.Scanner;
public class Ej_propuesto22 {
	public static void main(String[] args) {
		String nombre;
		int horas;
		int valorhora;
		double salario;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese nombre de empleado:");
		nombre = entrada.next();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese valor por hora trabajada:");
		valorhora = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese numero de horas trabajadas al mes:");
		horas = entrada2.nextInt();
		
		salario=horas*valorhora;
		
		if(salario>450000) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Salario: " + salario);
		}
		else {
			System.out.println("Nombre: " + nombre);
		}
		entrada.close();
		entrada1.close();
		entrada2.close();
		}
}

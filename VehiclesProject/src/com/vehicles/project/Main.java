package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix la matricula del cotxe: ");
		String matricula = scanner.nextLine();
		System.out.println("Introdueix la marca del cotxe: ");
		String marca = scanner.nextLine();
		System.out.println("Introdueix el color del cotxe: ");
		String color = scanner.nextLine();
		
		Car cotxe1 = new Car(matricula, marca, color);
		System.out.println(cotxe1);
		
		
		List<Wheel> backWheels = new ArrayList<>();
		System.out.println("Introdueix la marca de les rodes de darrera: ");
		String marcaRodaTras = scanner.nextLine();
		System.out.println("Introdueix el diametre de les rodes de darrera: ");
		String diamRodaTras = scanner.nextLine();
		Wheel trasera = new Wheel(marcaRodaTras,Double.parseDouble(diamRodaTras));
		Wheel trasera2 = new Wheel(marcaRodaTras,Double.parseDouble(diamRodaTras));

		backWheels.add(trasera);
		backWheels.add(trasera2);
		
		List<Wheel> frontWheels = new ArrayList<>();
		System.out.println("Introdueix la marca de les rodes de davant: ");
		String marcaRodaDav = scanner.nextLine();
		System.out.println("Introdueix el diametre de les rodes de davant: ");
		String diamRodaDav = scanner.nextLine();
		Wheel davant = new Wheel(marcaRodaDav,Double.parseDouble(diamRodaDav));
		Wheel davant2 = new Wheel(marcaRodaDav,Double.parseDouble(diamRodaDav));

		frontWheels.add(davant);
		frontWheels.add(davant2);
		
		try {
			cotxe1.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cotxe1.toString());
	}
}

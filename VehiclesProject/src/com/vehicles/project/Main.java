package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bon dia! Desitges crear un cotxe o una moto?");
		String tipus = scanner.nextLine();

		if (tipus.equals("cotxe")) {
			boolean correcte = false;
			String matricula;
			do {
				System.out.println("Introdueix la matricula del cotxe: ");
				matricula = scanner.nextLine();
				// if(matricula.length()<7||matricula.substring(0,3).contains(("[a-zA-Z]+"))||matricula.substring(4,7).contains("[0-9]+"))
				// {
				if (Character.isDigit(matricula.charAt(0)) && Character.isDigit(matricula.charAt(1))
						&& Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(3))
						&& !Character.isDigit(matricula.charAt(4)) && !Character.isDigit(matricula.charAt(5))
						&& !Character.isDigit(matricula.charAt(6))) {
					correcte = true;
				} else {
					System.out.println("la matrícula ha de contenir 4 digits + 3 lletres");
				}
			} while (!correcte);
			System.out.println("Introdueix la marca del cotxe: ");
			String marca = scanner.nextLine();
			System.out.println("Introdueix el color del cotxe: ");
			String color = scanner.nextLine();

			Car cotxe1 = new Car(matricula, marca, color);
			System.out.println(cotxe1);

			List<Wheel> backWheels = new ArrayList<>();
			System.out.println("Introdueix la marca de les rodes de darrera: ");
			String marcaRodaTras = scanner.nextLine();
			boolean marge = false;
			String diamRodaTras;
			do {
				System.out.println("Introdueix el diametre de les rodes de darrera: ");
				diamRodaTras = scanner.nextLine();
				double diamDouble = Double.parseDouble(diamRodaTras);
				if (diamDouble > 4 || diamDouble < 0.4) {
					System.out.println("El diametre no pot ser major de 4 ni menor de 0.4");
				} else {
					marge = true;
				}
			} while (!marge);
			Wheel trasera = new Wheel(marcaRodaTras, Double.parseDouble(diamRodaTras));
			Wheel trasera2 = new Wheel(marcaRodaTras, Double.parseDouble(diamRodaTras));

			backWheels.add(trasera);
			backWheels.add(trasera2);

			List<Wheel> frontWheels = new ArrayList<>();
			System.out.println("Introdueix la marca de les rodes de davant: ");
			String marcaRodaDav = scanner.nextLine();
			boolean marge2 = false;
			String diamRodaDav;
			double diamDavDouble;
			do {
				System.out.println("Introdueix el diametre de les rodes de davant: ");
				diamRodaDav = scanner.nextLine();
				diamDavDouble = Double.parseDouble(diamRodaDav);
				if (diamDavDouble > 4 || diamDavDouble < 0.4) {
					System.out.println("El diametre no pot ser major de 4 ni menor de 0.4");
				} else {
					marge2 = true;
				}
			} while (!marge2);
			Wheel davant = new Wheel(marcaRodaDav, diamDavDouble);
			Wheel davant2 = new Wheel(marcaRodaDav, diamDavDouble);

			frontWheels.add(davant);
			frontWheels.add(davant2);

			try {
				cotxe1.addWheels(frontWheels, backWheels);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(cotxe1.wheels);

		} else if (tipus.equals("moto")) {

			boolean correcte = false;
			String matricula;
			do {
				System.out.println("Introdueix la matricula de la moto: ");
				matricula = scanner.nextLine();
				if (Character.isDigit(matricula.charAt(0)) && Character.isDigit(matricula.charAt(1))
						&& Character.isDigit(matricula.charAt(2)) && Character.isDigit(matricula.charAt(3))
						&& !Character.isDigit(matricula.charAt(4)) && !Character.isDigit(matricula.charAt(5))
						&& !Character.isDigit(matricula.charAt(6))) {
					correcte = true;
				} else {
					System.out.println("la matrícula ha de contenir 4 digits + 3 lletres");
				}
			} while (!correcte);

			System.out.println("Introdueix la marca de la moto: ");
			String marca = scanner.nextLine();
			System.out.println("Introdueix el color de la moto: ");
			String color = scanner.nextLine();

			Bike moto1 = new Bike(matricula, marca, color);

			System.out.println("Introdueix la marca de la roda de darrera: ");
			String marcaRodaTras = scanner.nextLine();
			boolean marge = false;
			String diamRodaTras;
			do {
				System.out.println("Introdueix el diametre de la roda de darrera: ");
				diamRodaTras = scanner.nextLine();
				double diamDouble = Double.parseDouble(diamRodaTras);
				if (diamDouble > 4 || diamDouble < 0.4) {
					System.out.println("El diametre no pot ser major de 4 ni menor de 0.4");
				} else {
					marge = true;
				}
			} while (!marge);

			Wheel trasera = new Wheel(marcaRodaTras, Double.parseDouble(diamRodaTras));

			System.out.println("Introdueix la marca de la roda de davant: ");
			String marcaRodaDav = scanner.nextLine();
			boolean marge2 = false;
			String diamRodaDav;
			double diamDavDouble;
			do {
				System.out.println("Introdueix el diametre de la roda de davant: ");
				diamRodaDav = scanner.nextLine();
				diamDavDouble = Double.parseDouble(diamRodaDav);
				if (diamDavDouble > 4 || diamDavDouble < 0.4) {
					System.out.println("El diametre no pot ser major de 4 ni menor de 0.4");
				} else {
					marge2 = true;
				}
			} while (!marge2);

			Wheel davant = new Wheel(marcaRodaDav, diamDavDouble);

			moto1.addFrontWheel(davant);
			moto1.addRearWheel(trasera);
		}
		System.out.println(cotxe1.toString());

	}
}

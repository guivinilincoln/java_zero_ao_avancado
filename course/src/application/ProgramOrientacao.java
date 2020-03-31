package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramOrientacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle triangleX, triangleY;

		System.out.println("Enter the measures of triangle X: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		triangleX = new Triangle(a, b, c);

		System.out.println("Enter the measures of triangle Y: ");
		double aY = sc.nextDouble();
		double bY = sc.nextDouble();
		double cY = sc.nextDouble();
		triangleY = new Triangle(aY, bY, cY);

		System.out.printf("Triangle X area: %.4f%n", triangleX.calcularArea());
		System.out.printf("Triangle y area: %.4f %n%n", triangleY.calcularArea());

		if (triangleX.calcularArea() > triangleY.calcularArea()) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	}
}
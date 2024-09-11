package Abstact_example;

import java.util.Scanner;

public class Squre extends Shape {
	float side;

	@Override
	void collcetinpurt() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter Side");
		side = scan.nextFloat();
	}
	@Override
	void calculatearea() {
		area=side*side;
	}
}

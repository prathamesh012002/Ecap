package Abstact_example;

import java.util.Scanner;

public  class Circle extends Shape{
	Float radius;
	@Override
	void collcetinpurt() {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter radius");
		radius = scan.nextFloat();
	}
	@Override
	void calculatearea() {
		area=3.14f*radius*radius;
	}

}

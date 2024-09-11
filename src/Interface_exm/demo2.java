package Interface_exm;

public class demo2 implements Compute {
	@Override
	public void add() {
		float sum, num1,num2;
		num1=20.12f;
		num2=10.12f;
		sum = num1+num2;
		System.out.println("Addition is " +sum);
	}
	@Override
	public void sub() {
		float sub, num1,num2;
		num1=20.12f;
		num2=10.23f;
		sub = num1-num2;
		System.out.println("Addition is " +sub);
	}
}

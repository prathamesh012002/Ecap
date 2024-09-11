package Interface_exm;

public class demo1 implements Compute {
@Override
public void add() {
	int sum, num1,num2;
	num1=20;
	num2=10;
	sum = num1+num2;
	System.out.println("Addition is " +sum);
}
@Override
public void sub() {
	int sub, num1,num2;
	num1=20;
	num2=10;
	sub = num1-num2;
	System.out.println("Addition is " +sub);
}
}

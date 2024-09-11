package OOP;

public class Static {
	int a = 10;
	static int b=20;
	static void m1() {
		System.out.println("This is m1");
	}
	 void m2() {
		System.out.println("This is m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(b);
m1();
Static s=new Static();
System.out.println(s.a);
s.m2();
	}

}

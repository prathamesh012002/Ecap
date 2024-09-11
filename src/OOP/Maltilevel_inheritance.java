package OOP;

class D{
	int a;
	void display() {
		System.out.println(a);	}
}
class E extends D{
	int b;
	void Display() {
		System.out.println(b);	}
}
class C extends E{
	int c;
	void show() {
		System.out.println(c);
	}
	
}


public class Maltilevel_inheritance {
	public static void main(String[] args) {
		
C obj =new C();
obj.a=100;
obj.b=200;
obj.c=300;
obj.display();
obj.Display();
obj.show();
	}

}

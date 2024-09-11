package OOP;

class A{
	int a= 100;
	void display() {
		System.out.println(a);	}
}
class B extends A{
	int b= 200;
	void Display() {
		System.out.println(b);	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		
B obj =new B();
obj.display();
obj.Display();
	}

}

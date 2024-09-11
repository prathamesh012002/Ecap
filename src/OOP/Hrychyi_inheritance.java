package OOP;

class Perent{
	
	void Show1(int x) {
		System.out.println(x);	}
}
class Child1 extends Perent{

	void Show2(int y) {
		System.out.println(y);	}
}
class Child2 extends Perent{
	
	void show3(int z) {
		System.out.println(z);
	}
	
}

public class Hrychyi_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child1 ch=new Child1();
ch.Show1(10);
ch.Show2(20);
Child2 ch1=new Child2();
ch1.Show1(30);
ch1.show3(40);
	}

}

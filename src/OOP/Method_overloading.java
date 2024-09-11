package OOP;
class Bank{
	
	int getRIO() {
		return 0;
	}
}
class SBI extends Bank{

	int getRIO() {
		return 10;
	}
}
class ICICI extends Bank{
	
	int getRIO() {
		return 20;
	}
	
	
}
public class Method_overloading {

	public static void main(String[] args) {
		SBI s= new SBI();
		System.out.println(s.getRIO());
		ICICI i=new ICICI();
		System.out.println(i.getRIO());
	}

}

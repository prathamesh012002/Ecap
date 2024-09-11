package day1;

public class String_nonconstant {

	public static void main(String[] args) {
		String Name = new String("Prathamesh");
		String Name1 = new String( "Prathamesh");
		if(Name .equals (Name1)) {
			System.out.println("Address is same ");	
		}else {
			System.out.println("address is differsnt");
		}
		

	}

}

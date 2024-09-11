package day1;

public class String_method {

	public static void main(String[] args) {
		String Name = "Prathamesh";
		String Name1 = "prathamesh";
		System.out.println(Name.length());
		System.out.println(Name.toUpperCase());
		System.out.println(Name.toLowerCase());
		System.out.println(Name .concat(" ").concat(Name));
		//System.out.println(Name .concat(" ",+ Name));
		if(Name.equalsIgnoreCase(Name1)) {
			System.out.println("Same");
		}
		

	}

}

package Wrapper_Classs;

public class Wrapper_Exam {

	public static void main(String[] args) {
		// String----> int
		/*String s="Welcome";
		String s1="120";
		String s2="130";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));*/
		
		String s1="120.12";
		String s2="130.13";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		String s3="Flase";
		System.out.println(Boolean.parseBoolean(s3));
	}

}

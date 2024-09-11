package function;
class student{
	String name;
	String Qualification;
	int age;
	student(){
		System.out.println("Student Constructor");
	}
		void study() {
			System.out.println("student is running");
	}
		void run() {
			System.out.println("student is running");
	}
		
}

public class Constratur {
	public static void main(String[] args) {
		student s=new student();
		s.study();
		s.run();
	}

}

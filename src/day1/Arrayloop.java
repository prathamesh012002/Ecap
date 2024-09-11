package day1;

public class Arrayloop {

	public static void main(String[] args) {
		
		        int[] numbers = new int[10];
		        for (int i = 0; i < numbers.length; i++) {
		            numbers[i] = i + 1;
		        }
		      for (int number : numbers) {
		            System.out.print(number + " ");
		        }

}
}

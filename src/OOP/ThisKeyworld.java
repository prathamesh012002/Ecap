package OOP;

public class ThisKeyworld {
	int x,y;
	ThisKeyworld(int x,int y){
		this.x=x;
		this.y=y;
	}
	void Display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisKeyworld th=new ThisKeyworld(100,200); 
th.Display();
	}

}

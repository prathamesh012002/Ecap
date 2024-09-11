package function;
class Box{
	double width,height,depth;
	Box(){
		width=0;
		height=0;
		depth=0;
	}
	Box(double w,double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	Box(double len){
		width=height=depth=len;
	}
	double volume() {
		return(width*height*depth);
	}
}

public class Construtor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Box b=new Box();
		Box b = new Box(10.5,15.5,5.0);
		System.out.println(b.volume());
	}

}

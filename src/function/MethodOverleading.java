package function;
class Addre{
void ad() {
	int num=20;
	int num1=20;
	int sum=num+num1;
	System.out.println(sum);
	}
void ad(int num,int num1) {
	
	int sum=num+num1;
	System.out.println(sum);
	}
void ad(double num,double num1) {
	
	double sum=num+num1;
	System.out.println(sum);
	}
void ad(int num,float num1) {
	
	float sum=num+num1;
	System.out.println(sum);
	}
}
public class MethodOverleading {
	public static void main(String[] args) {
		Addre a=new Addre();
		a.ad();
		a.ad(20, 20);
a.ad(20.222, 12.520);
a.ad(20, 12.5f);
	}
}

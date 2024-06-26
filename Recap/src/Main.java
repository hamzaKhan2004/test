class Overload{
	void meth1(){
		System.out.println("Overloading");
	}
	void meth1(int a, int b){
		System.out.println("Addition of a & b is :"+ a+b);
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("1.0");
		Overload obj = new Overload();
		obj.meth1();
		obj.meth1(10,10);

	}
}

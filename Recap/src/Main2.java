class Override{
	void meth1(int a,int b){
		System.out.println(a+b);
	}
}
class B extends Override{
	
	void meth1(int a, int b) {
		System.out.println(a-b);
	}
}

public class Main2 {
	public static void main(String[] args) {
		System.out.println("1.0.1");
		B obj2 = new B();
		obj2.meth1(30, 20);
	}
}

package mypackage;

public class Methods {
	void display() {
		System.out.println(" This is a basic method");
	}
	void arthemitic() {
		int a=10 ,  b=20;
		System.out.println("Addition is :"+(a+b));
		System.out.println("Subtraction  is :"+(a-b));
		System.out.println("Multipliccation is :"+(a*b));
	}
	public static void main(String[] args) {
		
		Methods me =new Methods();
		me.display();
		me.arthemitic();
	}

}

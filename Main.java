package lab.multiple;
public class C implements A, B {

	@Override
	public void showA() {
		System.out.println("This is method from interface A");
	}

	@Override
	public void showB() {
		System.out.println("This is method from interface B");
	}

	public void showC() {
		System.out.println("This is method from class C");
	}

	public static void main(String[] args) {
		C obj = new C();
		obj.showA();
		obj.showB();
		obj.showC();
	}
}

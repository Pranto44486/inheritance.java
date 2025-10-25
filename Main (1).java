import java.util.*;
class Shape {
	double area() {
		return 0;
	}
}
class Circle extends Shape {
	double r;
	Circle(double r) {
		this.r = r;
	}
	double area() {
		return 3.1416 * r * r;
	}
}
class Rectangle extends Shape {
	double l, w;
	Rectangle(double l, double w) {
		this.l = l;
		this.w = w;
	}
	double area() {
		return l * w;
	}
}
class Triangle extends Shape {
	double b, h;
	Triangle(double b, double h) {
		this.b = b;
		this.h = h;
	}
	double area() {
		return 0.5 * b * h;
	}
}
public class Main {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(4, 6);
		Triangle t = new Triangle(3, 7);

		System.out.println("Circle area = " + c.area());
		System.out.println("Rectangle area = " + r.area());
		System.out.println("Triangle area = " + t.area());
	}
}

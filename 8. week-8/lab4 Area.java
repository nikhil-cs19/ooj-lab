
abstract class Shape{
	int num1,num2;
	void PrintArea(int a,int b) {
	  num1=a;
		num2=b;
	}
}
class Rectangle extends Shape{
	void printArea(int num1,int num2) {
		System.out.println("Area of rectangle = "+(num1*num2));
	}
}
class Triangle extends Shape{

	void printArea(int num1,int num2) {
		System.out.println("Area of Triangle = "+((double)(num1*num2)/2));
	}
}
class Circle extends Shape{

	void printArea(int num1) {
		System.out.println("Area of circle = "+(3.14*num1*num1));
	}
}
public class Area {

	public static void main(String[] args) {
       Rectangle r = new Rectangle();
       r.printArea(7,7);
       Triangle t = new Triangle();
       t.printArea(7,7);
       Circle c = new Circle();
       c.printArea(7);
	}

}

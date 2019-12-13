package day9;
//�Ʒ��� ������ ������ ShapeŬ�����̴�. �� Ŭ������ �������� �ϴ� CircleŬ��

//���� RectangleŬ������ �ۼ��Ͻÿ�. �� ��, �����ڵ� �� Ŭ������ �°� ������ �߰��ؾ�
//�Ѵ�.
//(1) Ŭ������ : Circle
//����Ŭ���� : Shape
//������� : double r - ������

class Circle extends Shape {
	double r;

	Circle(double r) {
		this.r = r;
	}

	double calcArea() {
		System.out.println(Math.PI * (r * r));
		return  Math.PI * (r * r);
	}
}

//(2) Ŭ������ : Rectangle
//����Ŭ���� : Shape
//������� : double width - ��
//double height - ����
//�޼��� :
//1. �޼���� : isSquare
//�� �� : ���簢������ �ƴ����� �˷��ش�.
//��ȯŸ�� : boolean
//�Ű����� : ����

class Rectangle extends Shape {
	double width;
	double height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	boolean isSquare() {
		return width == height;
	}

	double calcArea() {
		return width * height;
	}
}

abstract class Shape {
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}

//1. �޼���� : sumArea
//�� �� : �־��� �迭�� ��� �������� ���̸� ��� ���ؼ� ��ȯ�Ѵ�.
//��ȯŸ�� : double
//�Ű����� : Shape[] arr

class Ex {
	static double sumArea(Shape[] arr){
		
		double sumArea = 0;
		for(Shape shape: arr) {
				sumArea += shape.calcArea();
		}
		
		return sumArea;
	}
	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("������ ��:" + sumArea(arr));
	}
}

//[7-24] ���� �� �������̽��� ������ �ƴ� ����?
//a. ǥ��ȭ�� �����ϰ� ���ش�.
//b. ���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
//c. �������� ���α׷����� �����ϴ�.
//d. ���߻���� �����ϰ� ���ش�.
//e. ��Ű������ ������ �����ش�.
//}
//public String toString() {
//return "["+x+","+y+"]";
//}
//}

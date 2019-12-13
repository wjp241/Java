package day9;
//아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래

//스와 Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야
//한다.
//(1) 클래스명 : Circle
//조상클래스 : Shape
//멤버변수 : double r - 반지름

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

//(2) 클래스명 : Rectangle
//조상클래스 : Shape
//멤버변수 : double width - 폭
//double height - 높이
//메서드 :
//1. 메서드명 : isSquare
//기 능 : 정사각형인지 아닌지를 알려준다.
//반환타입 : boolean
//매개변수 : 없음

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

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

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

//1. 메서드명 : sumArea
//기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
//반환타입 : double
//매개변수 : Shape[] arr

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
		System.out.println("면적의 합:" + sumArea(arr));
	}
}

//[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
//a. 표준화를 가능하게 해준다.
//b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
//c. 독립적인 프로그래밍이 가능하다.
//d. 다중상속을 가능하게 해준다.
//e. 패키지간의 연결을 도와준다.
//}
//public String toString() {
//return "["+x+","+y+"]";
//}
//}

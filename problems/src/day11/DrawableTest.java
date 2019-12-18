package day11;
import java.util.Random;
interface Drawable {
	 void draw();
}
class Rect implements Drawable {
	public void draw() {
		System.out.println("�簢���� �׸��ϴ�.");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
}
class Diamond implements Drawable  {
	public void draw() {
		System.out.println("������ �׸��ϴ�.");
	}
}
public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);
		Drawable d = null;
		if(num == 0)
			d = () -> System.out.println("�簢���� �׸��ϴ�.");
		else if(num == 1)
			d = new Circle();		
		else if(num == 2)
			d = new Diamond();		
		output(d);
	}
	public static void output(Drawable d){
		System.out.println("���޵� ��ü�� Ŭ������ : "+
	                        d.getClass().getName());
		d.draw();
	}
}



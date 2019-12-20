package collection;

import java.util.HashSet;
import java.util.Iterator;

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<>();
		
//		4���� Product Ŭ������ ��ü�� �����Ͽ�
			Product[] prods = new Product[]{
				new Product("p100", "TV", "20000"),
				new Product("p200", "Computer", "10000"),
				new Product("p100", "MP3", "700"),
				new Product("p300", "Audio", "1000")
			};
			
//			- Product ��ü���� �����ϸ鼭 ������ �����ϸ�
//			������������ ����Ǿ����ϴ�.��
//			�׷��� ������
//			�������� ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.��
			for(Product prod: prods) {
				System.out.println(set.add(prod)? "���������� ����Ǿ����ϴ�.": "������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
			}

			//HashSet ��ü�� ������ �Ŀ� ������ ��ü���� ������ ��ǰ ������ ȭ�鿡 ����Ѵ�.
			Iterator<Product> iter = set.iterator();
			System.out.println("��ǰ ID\t\t��ǰ��\t\t����");
			while(iter.hasNext()) {
				Product obj = iter.next();
				System.out.print(obj);
			}
	}

}

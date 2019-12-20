package collection;

import java.util.HashSet;
import java.util.Iterator;

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<>();
		
//		4개의 Product 클래스의 객체를 생성하여
			Product[] prods = new Product[]{
				new Product("p100", "TV", "20000"),
				new Product("p200", "Computer", "10000"),
				new Product("p100", "MP3", "700"),
				new Product("p300", "Audio", "1000")
			};
			
//			- Product 객체들을 저장하면서 저장을 성공하면
//			“성공적으로 저장되었습니다.”
//			그렇지 않으면
//			“동일한 ID의 제품이 이미 저장되어 있습니다.”
			for(Product prod: prods) {
				System.out.println(set.add(prod)? "성공적으로 저장되었습니다.": "동일한 ID의 제품이 이미 저장되어 있습니다.");
			}

			//HashSet 객체에 보관한 후에 보관된 객체들을 꺼내서 제품 정보를 화면에 출력한다.
			Iterator<Product> iter = set.iterator();
			System.out.println("제품 ID\t\t제품명\t\t가격");
			while(iter.hasNext()) {
				Product obj = iter.next();
				System.out.print(obj);
			}
	}

}

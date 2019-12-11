package day7;

public class ProductTest {

	public static void main(String[] args) {
		Product[] productArr = new Product[5];
			productArr[0] = new Product("A", 1, 1000);
			productArr[1] = new Product("B", 2, 2000);
			productArr[2] = new Product("C", 3, 3000);
			productArr[3] = new Product("D", 4, 4000);
			productArr[4] = new Product();
			for(int i = 0; i < productArr.length; i ++) {
				productArr[i].printInfo();
			}
	}

}

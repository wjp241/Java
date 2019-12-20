package collection;

public class Product {
	private String productID;
	private String productName;
	private String productPrice;

	Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public boolean equals(Object obj) {
		System.out.println("equals was called" + obj);
		if (obj instanceof Product) {
			Product tmp = (Product) obj;
			return productID.equals(tmp.productID);
		}
		return false;
	}

	public int hashCode() {
		System.out.println("hashcode was called" + productID);
		return productID.hashCode();
	}

	public String toString() {
		return String.format("%s\t\t%-8s\t%s\n", productID, productName, productPrice);
	}



}

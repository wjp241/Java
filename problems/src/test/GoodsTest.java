package test;



public class GoodsTest {

	public static void main(String[] args) {
		// "PRD-0001", "��ũ��ǻ��", 10000, 'N' ���� ��ü ����
		Goods goodsObj1 = new Goods("PRD-0001", "��ũ��ǻ��", 10000, 'N');
		Goods goodsObj2 = new Goods("PRD-0002", "�ν���ǻ��", 20000);
		// "PRD-0002", "�ν���ǻ��", 20000 ���� ��ü ����
		// ������ ��ü ���� getGoodsInfo()�� ȣ���ϰ� ���ϰ���� ����մϴ�.
		System.out.println(goodsObj1.getGoodsInfo());
		System.out.println(goodsObj2.getGoodsInfo());

	}
}

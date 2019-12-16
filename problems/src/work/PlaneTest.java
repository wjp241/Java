package work;

public class PlaneTest {

	public static void main(String args[]) {
		// Airplane�� Cargoplane ��ü ����
		Airplane airplaneObj = new Airplane( "L747", 1000);
		Cargoplane cargoplaneObj = new Cargoplane( "C40", 1000);
		
		// ������ ��ü�� ���� ���
		// Airplane�� Cargoplane ��ü�� 100�� ���� �� ��ü ���� ���

		Plane[] list = { airplaneObj, cargoplaneObj };
		printInfo(list);
		
		for(Plane plane:list) {
			plane.flight(100);
		}
		
		printInfo(list);

//		 Airplane�� Cargoplane ��ü�� 200 ���� �� ��ü ���� ���
		for(Plane plane:list) {
			plane.refuel(200);
		}
		printInfo(list);

	}

	public static void printInfo(Plane[] list) {

		System.out.println("Plane\tfuelSize");
		for (Plane plane : list) {
			System.out.printf("%s\t%d\n", plane.getPlaneName(), plane.getFuelSize());

		}

	}
	// Plane ��ü���� ������ ���(��� ��� ����)

}

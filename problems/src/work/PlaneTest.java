package work;

public class PlaneTest {

	public static void main(String args[]) {
		// Airplane과 Cargoplane 객체 생성
		Airplane airplaneObj = new Airplane( "L747", 1000);
		Cargoplane cargoplaneObj = new Cargoplane( "C40", 1000);
		
		// 생성된 객체의 정보 출력
		// Airplane과 Cargoplane 객체에 100씩 운항 후 객체 정보 출력

		Plane[] list = { airplaneObj, cargoplaneObj };
		printInfo(list);
		
		for(Plane plane:list) {
			plane.flight(100);
		}
		
		printInfo(list);

//		 Airplane과 Cargoplane 객체에 200 주유 후 객체 정보 출력
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
	// Plane 객체들의 데이터 출력(출력 결과 참조)

}

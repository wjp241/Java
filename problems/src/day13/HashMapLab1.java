package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapLab1 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String countryName;
		int population;

		while (map.size() < 5) {
			System.out.println("나라이름을 입력하세요 :");
			countryName = sc.next();
			System.out.println("인구 수를 입력하세요 : ");
			population = sc.nextInt();

//이미 있는지 확인하는 두방법
			
//			if (map.containsKey(countryName)) {
//				System.out.printf("나라명 %s는 이미 저장되었습니다.\n", countryName);
//			} else {
//				map.put(countryName, population);
//				System.out.println("저장되었습니다.");
//			}
			
			//만약 키가 이미 있으면, 키의 값을 주고, 그게 아니면 null 을준다.
			// put 을 미리 해줌.
			if(map.putIfAbsent(countryName, population) != null) {
				System.out.printf("나라명 %s는 이미 저장되었습니다.\n", countryName);

			} else {
				System.out.println("저장되었습니다.");
			}
		}

		sc.close();

		System.out.println("5개가 모두 입력되었습니다.");

		// 입력된 데이터 : XX(nn), XX(nn)....

		// 세가지 방법

		System.out.println("포이치1");
		System.out.print("입력된 데이터 :");
		int i = map.size();
		for (HashMap.Entry<String, Integer> entry : map.entrySet()) {

			System.out.printf("%s(%d)%s", entry.getKey(), entry.getValue(), (i != 1) ? ", " : "");
			i--;

		}

		System.out.println();
		System.out.println("포이치2");
		System.out.print("입력된 데이터 :");
		i = map.size();
		for (String key : map.keySet()) {
			System.out.printf("%s(%d)%s", key, map.get(key), (i != 1) ? ", " : "");
			i--;
		}

		Iterator<String> keys = map.keySet().iterator();
		System.out.println();
		System.out.println("이터레이터");
		System.out.print("입력된 데이터 :");
		String currKey;
		while (keys.hasNext()) {
			currKey = keys.next();
			System.out.printf("%s(%d)%s", currKey, map.get(currKey), (keys.hasNext()) ? ", " : "");

		}

	}

}

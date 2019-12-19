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
			System.out.println("�����̸��� �Է��ϼ��� :");
			countryName = sc.next();
			System.out.println("�α� ���� �Է��ϼ��� : ");
			population = sc.nextInt();

//�̹� �ִ��� Ȯ���ϴ� �ι��
			
//			if (map.containsKey(countryName)) {
//				System.out.printf("����� %s�� �̹� ����Ǿ����ϴ�.\n", countryName);
//			} else {
//				map.put(countryName, population);
//				System.out.println("����Ǿ����ϴ�.");
//			}
			
			//���� Ű�� �̹� ������, Ű�� ���� �ְ�, �װ� �ƴϸ� null ���ش�.
			// put �� �̸� ����.
			if(map.putIfAbsent(countryName, population) != null) {
				System.out.printf("����� %s�� �̹� ����Ǿ����ϴ�.\n", countryName);

			} else {
				System.out.println("����Ǿ����ϴ�.");
			}
		}

		sc.close();

		System.out.println("5���� ��� �ԷµǾ����ϴ�.");

		// �Էµ� ������ : XX(nn), XX(nn)....

		// ������ ���

		System.out.println("����ġ1");
		System.out.print("�Էµ� ������ :");
		int i = map.size();
		for (HashMap.Entry<String, Integer> entry : map.entrySet()) {

			System.out.printf("%s(%d)%s", entry.getKey(), entry.getValue(), (i != 1) ? ", " : "");
			i--;

		}

		System.out.println();
		System.out.println("����ġ2");
		System.out.print("�Էµ� ������ :");
		i = map.size();
		for (String key : map.keySet()) {
			System.out.printf("%s(%d)%s", key, map.get(key), (i != 1) ? ", " : "");
			i--;
		}

		Iterator<String> keys = map.keySet().iterator();
		System.out.println();
		System.out.println("���ͷ�����");
		System.out.print("�Էµ� ������ :");
		String currKey;
		while (keys.hasNext()) {
			currKey = keys.next();
			System.out.printf("%s(%d)%s", currKey, map.get(currKey), (keys.hasNext()) ? ", " : "");

		}

	}

}

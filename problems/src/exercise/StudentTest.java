package exercise;

public class StudentTest {

	public static void main(String[] args) {
		Student arrays [] = new Student[3];
		arrays[0] = new Student("ȫ�浿", 20, 171, 81, "201101", "����") ;
		arrays[1] = new Student("��浿", 21, 183, 72, "201102", "����") ;
		arrays[2] = new Student("�ڱ浿", 22, 175, 65, "201103", "�İ�") ;

		// �迭�� �ִ� ��ü ������ printInformation()�� ȣ���Ͽ� ��� ��� �Ѵ�.
		for(Student student:arrays) {
			System.out.println(student.printInformation()); 
		}

	}

}


//���� ���
//ȫ�浿 20 171 81 201101 ����
//��浿 21 183 72 201102 ����
//�ڱ浿 22 175 65 201103 �İ�
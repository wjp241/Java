package LottoMachine;

public class LottoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. LottoMachine�� ��ü�� �����Ѵ�. 
		LottoMachine lottoObj = new LottoMachine();

//		2. createLottoNums()�� ȣ���Ͽ� �ζ� ��ȣ���� �迭�� �����Ѵ�.
		lottoObj.createLottoNums();
//		3. checkLottoNums()�� ȣ���ϰ� 
		try {
			lottoObj.checkLottoNums();
//			���ܰ� �߻����� ������ getNums() �� ȣ���Ͽ� �ζ� �ѹ����� ȭ�鿡 ���(x, x, x, x, x, x)�ϰ� 

			int[] nums = lottoObj.getNums();
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + (i != nums.length - 1 ? "," : ""));
			}
		} catch (DuplicateException e) {
			// ���ܰ� �߻��ϸ� ���� �޽���(���ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ١�)�� ����ϰ� �����Ѵ�.
			System.out.println(e.getMessage());
		}

	}

}

package LottoMachine;

public class LottoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. LottoMachine의 객체를 생성한다. 
		LottoMachine lottoObj = new LottoMachine();

//		2. createLottoNums()를 호출하여 로또 번호들을 배열에 구성한다.
		lottoObj.createLottoNums();
//		3. checkLottoNums()를 호출하고 
		try {
			lottoObj.checkLottoNums();
//			예외가 발생하지 않으면 getNums() 를 호출하여 로또 넘버들을 화면에 출력(x, x, x, x, x, x)하고 

			int[] nums = lottoObj.getNums();
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + (i != nums.length - 1 ? "," : ""));
			}
		} catch (DuplicateException e) {
			// 예외가 발생하면 예외 메시지(“중복된 로또 번호가 발생했습니다”)를 출력하고 종료한다.
			System.out.println(e.getMessage());
		}

	}

}

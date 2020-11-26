package condition;

public class ConditionExample3 {
//Math.random 0과 1사이에 랜덤값(난수)
//(int)라고 쓰면 형변환으로 정수값만 출력함
	public static void main(String[] args) {
		int random = (int)(Math.random()*6);

		switch (random) {
		case 6 :
			System.out.println("6"); break;
		case 5 :
			System.out.println("5"); break;
		case 4 :
			System.out.println("4"); break;
		case 3 :
			System.out.println("3"); break;
		case 2 :
			System.out.println("2"); break;
		default :
			System.out.println("1");
		}

	}

}

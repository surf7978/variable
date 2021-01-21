import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		//mainWindow();
		
		int[][] test = new int[2][6];
		for(int i=0; i<test.length; i++) {
			for(int j=0; j<test[i].length; j++) {
				test[i][j] += i+j;
				System.out.println(test[i][j]);
			}
		}
		//mathAvg(test);
		
		
		// 팁1
//		 Random random = new Random();
//		 random.nextInt(44)+1해도됨

		// 팁2
//		for(int i=0; i<게임횟수; i++) { //게임횟수
//			for(int j=0; j<추첨횟수; j++) { //게임당 추첨횟수
//				for(int k=0; k<j; k++) { //중복제거
//					if(lotto[i][j]==lotto[i][k]) {
//						j--;
//					}
//				}
//			}
//		} Arrays.sort(lotto[i]); //정렬
//
//		List sortMathAry = new ArrayList();
//		for(int i=0; i<mathAry.length; i++) {
//			sortMathAry.add(mathAry[i]); 
//		}
//		Collections.sort(sortMathAry);
//		System.out.print("당첨번호 정렬 : ");
//		System.out.println(sortMathAry);
		
		//팁3
//		 java 파일 export할때는 .jre로
//		 web파일은 .war로 export할 것

	}
	public static void mainWindow() {
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.print("금액입력 >> ");

			int insertMoney = scn.nextInt();
			scn.nextLine();
			if (insertMoney < 1000) {
				break;
			} else if (insertMoney >= 1000) {
				int play = insertMoney / 1000;
				System.out.println(insertMoney + "원 충전으로 " + play + "회 실행");
				
				lotto(play);
				
			}
			System.out.println("");
		}
		System.out.println("<<잔액부족>>");
	}

	public static void lotto(int play) {
		double result = (Math.random() * 45) + 1;
		System.out.println("당첨번호");
		int[][] mathAry = new int[play][6];
		for (int i = 0; i < play; i++) {
			for (int j = 0; j < 6; j++) {
				result = (Math.random() * 45) + 1; // 0<Math.random()*45<1 이라 +1해줘야함
				mathAry[i][j] = (int) result;
				for (int k = 0; k < j; k++) { //중복제거 중복나면 1칸뒤로가서 다시비교 거기서도 같은숫자있으면 또 뒤로감
					if (mathAry[i][j] == mathAry[i][k]) {
						j--;
					}
				}
			}
			Arrays.sort(mathAry[i]); //배열이 Collection이면 Collections.sort()
			System.out.println(Arrays.toString(mathAry[i])); 
		}
	}
	
	public static void mathAvg(int[][] mathAry) {
		
	}

}

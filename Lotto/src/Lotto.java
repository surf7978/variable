import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		boolean run = true;
		double result = Math.random()*44+1;
		//Random random =  new Random();
		//random.nextInt(44)+1해도됨

		
		while(run) {
			System.out.print("금액입력 >> ");

			int insertMoney = scn.nextInt();
			scn.nextLine();
			if(insertMoney<1000) {
				System.out.println("<<잔액부족>>");
				break;
			}else if(insertMoney>=1000) {
				
				int play = insertMoney/1000;
				System.out.println(insertMoney+"원 충전으로 "+play+"회 실행");
				
				System.out.println("당첨번호");
				int[][] mathAry = new int[play][6];
				for(int i=0; i<play; i++) {
					for(int j=0; j<6; j++) {
						result = Math.random()*44+1;
						mathAry[i][j] = (int) result;
						for(int k=0; k<j; k++) {
							if(mathAry[i][j]==mathAry[i][k]) {
								j--;
							}
						}
					}
					Arrays.sort(mathAry[i]);
					System.out.println(Arrays.toString(mathAry[i]));
					}
				}
			
			
//				for(int i=0; i<게임횟수; i++) { //게임횟수
//					for(int j=0; j<추첨횟수; j++) { //게임당 추첨횟수
//						for(int k=0; k<j; k++) { //중복제거
//							if(lotto[i][j]==lotto[i][k]) {
//								j--;
//							}
//						}
//					}
//				} Arrays.sort(lotto[i]); //정렬
				
//				List sortMathAry = new ArrayList();
//				for(int i=0; i<mathAry.length; i++) {
//					sortMathAry.add(mathAry[i]); 
//				}
//				Collections.sort(sortMathAry);
//				System.out.print("당첨번호 정렬 : ");
//				System.out.println(sortMathAry);
			System.out.println("");
		}
		System.out.println("<<프로그램 종료>>");
	}

	//java 파일 export할때는 .jre로
	//web파일은 .war로 export할 것
	
}

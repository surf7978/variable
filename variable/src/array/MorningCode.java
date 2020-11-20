package array;

public class MorningCode {
	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
//		intAry[0] = new int[] {1,2,3,4,5};
//		intAry[1] = new int[] {6,7,8,9,10};
//		intAry[2] = new int[] {11,12,13,14,15};
//		intAry[3] = new int[] {16,17,18,19,20};
//		intAry[4] = new int[] {21,22,23,24,25};
		//이걸 for구문으로 만들어보세요.
		int k=1;
		for(int i=0; i<intAry.length; i++) 
		{
			for(int j=0; j<intAry[i].length; j++) 
			{
				intAry[i][j]= k++;
//선택2			intAry[i] = new int[] {k,(k+1),(k+2),(k+3),(k+4)};
				System.out.println("intAry["+i+"]["+j+"] > "+intAry[i][j]);
			}
//선택2		k+=5;
		}
		System.out.println("---------------------------");
		
		
		
		String[] strAry = {"Hello","World"};
		for(String str : strAry) {
			System.out.println(str);
		}
		
		
	}
}

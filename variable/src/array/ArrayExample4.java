package array;

public class ArrayExample4 {

	public static void main(String[] args) {
		int[][] intAry = new int[3][3];
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };
		System.out.println(intAry[0][0]);
		System.out.println(intAry.length);
		System.out.println(intAry[0].length);

		for(int i=0; i<intAry.length; i++) 
		{
			for(int j=0; j<intAry[i].length; j++) 
			{
				System.out.println("intAry["+i+"]["+j+"] > "+intAry[i][j]);
			}
		}
		System.out.println("-----------");
		
		int[][] intAry2 = 
		{ 
				{ 11, 12, 13 }, 
				{ 21 }, 
				{ 34, 32 } 
		};
		
		System.out.println(intAry2[0][0]);
		System.out.println(intAry2.length);
		System.out.println(intAry2[1].length);
		for(int i=0; i<intAry2.length; i++) 
		{
			for(int j=0; j<intAry2[i].length; j++) 
			{
				System.out.println("intAry2["+i+"]["+j+"] > "+intAry2[i][j]);
			}
		}
//숙제 intAry2의 배열의 각 합계와 평균
//정답 intAry2[0] => 합 :(11+12+13) , 평균 :(11+12+13)/3
//    intAry2[1] => 합 :21, 평균 :21
//    intAry2[2] => 합 :32+33 , 평균 :(32+33)/2
		int sum=0;
		int i=0,j=0;
		for(i=0; i<intAry2.length; i++) 
		{
			for(j=0; j<intAry2[i].length; j++) 
			{
				sum+= intAry2[i][j];
			}
			System.out.println("intAry2["+i+"]행의 합"+sum);
			System.out.println("intAry2["+i+"]행의 평균"+(sum/(j)));
			sum =0;
		}
		
		
	}
}

package array;
import java.util.Scanner;
public class Exercise09p181 
{
//교재 p.181 9번문제 만들기
	public static void main(String[] args) 
	{
		Scanner a = new Scanner(System.in);
		boolean b = true;
		int c=0;
		int d;
		double[] e = null;
		double f = 0;
		
		while(b) 
		{
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 >> ");
			
			d = a.nextInt();
			
			if(d==1) 
			{
				if(c <= 0) 
				{
					System.out.println("학생이 없습니다.");
					System.out.print("1.학생수 등록 >> ");
					c = a.nextInt();
					for(int i=0; i>=0; i++) 
					{
						if(c<=0) 
						{
							System.out.println("뭐하십니까? 휴먼, 제대로 등록하세요.");
							break;
						}
						else 
						{
							System.out.println(c+"명의 학생이 등록되었습니다.");
							e = new double[c];
							break;
						}
					}
				}
				else 
				{
					System.out.println("이미 학생수가 등록되었습니다.");
				}
			}
			else if(d==2) 
			{
				if(c == 0) {System.out.print("등록된 학생이 없습니다.");}
				else 
				{
					System.out.println("2.점수입력 >> 총 학생수 : "+c+"명");
					for(int i=0; i<e.length; i++) 
					{
						System.out.print("            "+(i+1)+"번째 학생 점수 : ");
						e[i] += a.nextDouble();
					}
				}
			}
			else if(d==3) 
			{
				if(c == 0) {System.out.print("등록된 학생이 없습니다.");}
				else 
				{
					System.out.println("3.점수리스트 >> ");
					for(int i=0; i<e.length; i++) 
					{
						System.out.println("             "+(i+1)+"번째 학생 : "+e[i]);
					}
				}
			}
			else if(d==4) 
			{
				if(c == 0) {System.out.print("등록된 학생이 없습니다.");}
				else 
				{
					f = e[0];
					int g = 0;
					for(int i=0; i<e.length; i++) 
					{
						if(f < e[i]) 
						{
							f = e[i];
							g = i+1;
						}
					}
					System.out.println("최고점수는 "+g+"번째 학생 : "+f);
					
					f = 0;
					for(int i=0; i<e.length; i++) 
					{
						f += e[i];
					}
					System.out.println(c+"명의 평균점수 : "+(double)(f/c));
				}
			}
			else if(d==5) 
			{
				b = false;
			}
		}
		System.out.println("< 프로그램 종료 >");
	}
}
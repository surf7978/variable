public class TEST 
{
	public static void main(String[] args) 
	{
		int a,b;
		int c=5; //�ٴ� ����� ������ ����
		for(a=0; a<c; a++) //�� �� ������ ����
		{
		 for(b=a; b<c; b++) {System.out.print("$");}
		 //a�� $��¼��� ������
		 for(b=c-a; b<c; b++) {System.out.print("#");}
		 //c-a�� #��¼��� ������		
		 System.out.println(""); 
		 //�ٹٲ޿�
		}
	}
}
package item;

public class item {
public static void main(String[] args) 
{
String[] bag=new String[10];
scanner scn= new scanner(System.in);
boolean run = true;

while(run)
{
System.out.println("-----------------------------------------");
System.out.println("| 1.제작 | 2.강화 | 3.목록 | 4.판매 | 5.종료 |");
System.out.println("-----------------------------------------");
System.out.print("이용할 서비스 선택 >> ");

int menuNo = scn.nextInt();
scn.nextLine();

if(menuNo ==1)
{
System.out.println("제작가능 아이템 목록 : 1.무기 2.투구 3.갑옷 4.신발");
System.out.print("제작할 아이템 선택 >> ");
int menu1 = scn.nextInt();
if(menu1 ==1)
{
//0.공격력 1.방어력 2.생명력 3.치명확률 4.속도
for(int i=0; i<4 i++)
{ 
int option= Math.random()*6;
String[] sword = new String[4];
if(option==0)
{
int ATK = Math.random()*7
sword[i] = new String[] {"공격력"+ATK};
}//option0 
else if (option==1)
{
int DEF = Math.random()*5
sword[i] =new String[] {"방어력"+DEF};
}//option1
else if (option==2)
{
int HP = Math.random()*7
sword[i] =new String[] {"생명력"+HP};
}//option2
else if (option==3)
{
int CRI = Math.random()*5
sword[i] =new String[] {"치명확률"+CRI};
}//option3
else if (option==4)
{
int AGI = Math.random()*4
sword[i] =new String[] {"속도"+AGI};
}//option4
}//menu1-1 option for
for(int i=0; i<bag.length; i++)
{
if(bag[i]==null)
bag[i]=sword;
break;  
}//menu1-1 bag for 
}//menu1-1
else if(menu1 ==2)
{
for(int i=0; i<4 i++)
{ 
int option= Math.random()*6;
String[] head = new String[4];
if(option==0)
{
int ATK = Math.random()*7
head[i] = new String[] {"공격력"+ATK};
}//option0 
else if (option==1)
{
int DEF = Math.random()*5
head[i] =new String[] {"방어력"+DEF};
}//option1
else if (option==2)
{
int HP = Math.random()*7
head[i] =new String[] {"생명력"+HP};
}//option2
else if (option==3)
{
int CRI = Math.random()*5
head[i] =new String[] {"치명확률"+CRI};
}//option3
else if (option==4)
{
int AGI = Math.random()*4
head[i] =new String[] {"속도"+AGI};
}//option4
}//menu1-2 option for
for(int i=0; i<bag.length; i++)
{
if(bag[i]==null)
bag[i]=head;
break;  
}//menu1-2 bag for 
}//menu1-2
else if(menu1 ==3)
{
for(int i=0; i<4 i++)
{ 
int option= Math.random()*6;
String[] body = new String[4];
if(option==0)
{
int ATK = Math.random()*7
body[i] = new String[] {"공격력"+ATK};
}//option0 
else if (option==1)
{
int DEF = Math.random()*5
body[i] =new String[] {"방어력"+DEF};
}//option1
else if (option==2)
{
int HP = Math.random()*7
body[i] =new String[] {"생명력"+HP};
}//option2
else if (option==3)
{
int CRI = Math.random()*5
body[i] =new String[] {"치명확률"+CRI};
}//option3
else if (option==4)
{
int AGI = Math.random()*4
body[i] =new String[] {"속도"+AGI};
}//option4
}//menu1-1 option for
for(int i=0; i<bag.length; i++)
{
if(bag[i]==null)
bag[i]=body;
break;  
}//menu1-3 bag for 
}//menu1-3
else if(menu1 ==4)
{
for(int i=0; i<4 i++)
{ 
int option= Math.random()*6;
String[] shoes = new String[4];
if(option==0)
{
int ATK = Math.random()*7
shoes[i] = new String[] {"공격력"+ATK};
}//option0 
else if (option==1)
{
int DEF = Math.random()*5
shoes[i] =new String[] {"방어력"+DEF};
}//option1
else if (option==2)
{
int HP = Math.random()*7
shoes[i] =new String[] {"생명력"+HP};
}//option2
else if (option==3)
{
int CRI = Math.random()*5
shoes[i] =new String[] {"치명확률"+CRI};
}//option3
else if (option==4)
{
int AGI = Math.random()*4
shoes[i] =new String[] {"속도"+AGI};
}//option4
}//menu1-1 option for
for(int i=0; i<bag.length; i++)
{
if(bag[i]==null)
bag[i]=shoes;
break;  
}//menu1-1 bag for 
}//menu1-4
}//menu1
else if(menuNo ==2)
{

}//menu2
else ifmenuNo ==3)
{
System.out.println("현재 보유한 장비목록");
for(int i=0; i<bag.length; i++) 
{
if(bag[i] != null)
{
for(int j=0; j<bag[i].length; j++)
{
System.out.print(bag[i][j]+" ");
}
System.out.println();
}
}//list for
}//menu3
else if(menuNo ==4)
{
}//menu4
else if(menuNo ==5) run = false;

}//while
System.out.println("<<프로그램 종료>>");
}// main

	public void bagList() {
		System.out.println();
	}// bagList

}// class

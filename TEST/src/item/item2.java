package item;

import java.util.Scanner;

public class item2 {

	public static void main(String[] args) {
		String[][] bag = new String[10][7];
		boolean run = true;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.제작 | 2.제련 | 3.판매 | 4.목록 | 5.종료 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("사용할 메뉴 선택 >> ");
			int selectMenu = scn.nextInt();

			if (selectMenu == 1) {
				//item1 menu1 = new item1();
			} else if (selectMenu == 2) {
				System.out.print("제련할 장비 선택 >> ");
				int selectItem = scn.nextInt();
				for (int i = 1; i < bag.length; i++) {
					if (selectItem == i) {
						bag[i - 1][1] += 1;
						double randomUpgrade = Math.random() * 4;
						if ((int) randomUpgrade == 0) {
							double randomUpgradeVal = Math.random() * 3;
							if ((int) randomUpgradeVal == 0) {
								bag[i - 1][3] += 3;
							} else if ((int) randomUpgradeVal == 1) {
								bag[i - 1][3] += 4;
							} else if ((int) randomUpgradeVal == 2 || (int) randomUpgradeVal == 3) {
								bag[i - 1][3] += 5;
							}
						}
						else if ((int) randomUpgrade == 1) {
							double randomUpgradeVal = Math.random() * 3;
							if ((int) randomUpgradeVal == 0) {
								bag[i - 1][4] += 3;
							} else if ((int) randomUpgradeVal == 1) {
								bag[i - 1][4] += 4;
							} else if ((int) randomUpgradeVal == 2 || (int) randomUpgradeVal == 3) {
								bag[i - 1][4] += 5;
							}
						}
						else if ((int) randomUpgrade == 2) {
							double randomUpgradeVal = Math.random() * 3;
							if ((int) randomUpgradeVal == 0) {
								bag[i - 1][5] += 3;
							} else if ((int) randomUpgradeVal == 1) {
								bag[i - 1][5] += 4;
							} else if ((int) randomUpgradeVal == 2 || (int) randomUpgradeVal == 3) {
								bag[i - 1][5] += 5;
							}
						}
						else if ((int) randomUpgrade == 3 || (int) randomUpgrade == 4) {
							double randomUpgradeVal = Math.random() * 3;
							if ((int) randomUpgradeVal == 0) {
								bag[i - 1][6] += 3;
							} else if ((int) randomUpgradeVal == 1) {
								bag[i - 1][6] += 4;
							} else if ((int) randomUpgradeVal == 2 || (int) randomUpgradeVal == 3) {
								bag[i - 1][6] += 5;
							}
						}
					}
					break;
				}
			} else if (selectMenu == 3) {
				System.out.print("판매할 장비 선택 >> ");
				int selectItem = scn.nextInt();
				for (int i = 1; i < bag.length; i++) {
					if (selectItem == i) {
						bag[i - 1] = null;
						break;
					}
				}
			} else if (selectMenu == 4) {
				for(int i=0; i<bag.length; i++) {
					if(bag[i] != null) {
						for (int j = 0; j < bag[i].length; j++) {
							System.out.print(bag[i][j]);
						}
						System.out.println();
					}
					System.out.println();
				}
			} else if (selectMenu == 5) {
				System.out.println("<<프로그램 종료>>");
				run = false;
			}
		}
	}
}

package item;

import java.util.Scanner; //이거해야 스캐너 사용가능

public class item1 {
	public static void main(String[] args) {
		String[][] bag = new String[10][6];
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("| 1.무기 | 2.투구 | 3.갑옷 | 4.신발 | 5.뒤로 |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.print("제작할 장비 선택 >> ");
			int selectItem = scn.nextInt();

			if (selectItem == 1) {
				for (int i = 0; i < bag.length; i++) {
					if (bag[i][0] == null) {
						bag[i][0] = (i+1) + "번째 칸 : ";
						bag[i][1] = "무기 ";
						for (int k = 2; k < bag[i].length; k++) {
							// 0공격력 1방어력 2체력 3치명확률 4속도
							double randomOption = Math.random() * 5;
							if ((int) randomOption == 0) {
								String OptionName = "공격력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 1) {
								String OptionName = "방어력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 2) {
								String OptionName = "체력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 3) {
								String OptionName = "치명확률";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 4 || (int) randomOption == 5) {
								String OptionName = "속도";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 2;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + " ";
								}
							}
						}
						break;
					}
				}
			} else if (selectItem == 2) {
				for (int i = 0; i < bag.length; i++) {
					if (bag[i][0] == null) {
						bag[i][0] = (i+1) + "번째 칸 : ";
						bag[i][1] = "투구 ";
						for (int k = 2; k < bag[i].length; k++) {
							// 0공격력 1방어력 2체력 3치명확률 4속도
							double randomOption = Math.random() * 5;
							if ((int) randomOption == 0) {
								String OptionName = "공격력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 1) {
								String OptionName = "방어력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 2) {
								String OptionName = "체력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 3) {
								String OptionName = "치명확률";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 4 || (int) randomOption == 5) {
								String OptionName = "속도";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 2;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + " ";
								}
							}
						}
						break;
					}
				}
			} else if (selectItem == 3) {
				for (int i = 0; i < bag.length; i++) {
					if (bag[i][0] == null) {
						bag[i][0] = (i+1) + "번째 칸 : ";
						bag[i][1] = "갑옷 ";
						for (int k = 2; k < bag[i].length; k++) {
							// 0공격력 1방어력 2체력 3치명확률 4속도
							double randomOption = Math.random() * 5;
							if ((int) randomOption == 0) {
								String OptionName = "공격력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 1) {
								String OptionName = "방어력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 2) {
								String OptionName = "체력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 3) {
								String OptionName = "치명확률";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 4 || (int) randomOption == 5) {
								String OptionName = "속도";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 2;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + " ";
								}
							}
						}
						break;
					}
				}
			} else if (selectItem == 4) {
				for (int i = 0; i < bag.length; i++) {
					if (bag[i][0] == null) {
						bag[i][0] = (i+1) + "번째 칸 : ";
						bag[i][1] = "신발 ";
						for (int k = 2; k < bag[i].length; k++) {
							// 0공격력 1방어력 2체력 3치명확률 4속도
							double randomOption = Math.random() * 5;
							if ((int) randomOption == 0) {
								String OptionName = "공격력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 1) {
								String OptionName = "방어력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 2) {
								String OptionName = "체력";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 7;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 3) {
								String OptionName = "치명확률";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + "% ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 5;
									bag[i][k] = OptionName + Value + "% ";
								}
							} else if ((int) randomOption == 4 || (int) randomOption == 5) {
								String OptionName = "속도";
								double randomValue = Math.random() * 2;
								if ((int) randomValue == 0) {
									int Value;
									Value = 2;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 1) {
									int Value;
									Value = 3;
									bag[i][k] = OptionName + Value + " ";
								} else if ((int) randomValue == 2) {
									int Value;
									Value = 4;
									bag[i][k] = OptionName + Value + " ";
								}
							}
						}
						break;
					}
				}
			} else if (selectItem == 5) {
				run = false;
			} else if (selectItem == 6) {
				for (int i = 0; i < bag.length; i++) {
					if (bag[i][0] != null) {
						for (int j = 0; j < bag[i].length; j++) {
							System.out.print(bag[i][j]);
						}
						System.out.println();
					}
					System.out.println();
				}
			}
		}
	}
}
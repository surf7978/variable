package variable;

public class Exercise04 {
//문장 정렬 : ctrl+shift+f
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		// 학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils / students);
		System.out.println("학생 한 명이 가지는 연필 수 : " + pencilsPerStudent);
		// 남은 연필 수
		int pecilsLeft = (pencils % students);
		System.out.println("남은 연필 수 : " + pecilsLeft);
	}
}

package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//이렇게 출력
//Example 1:
//Input: x = 123
//Output: 321
//
//Example 2:
//Input: x = -123
//Output: -321
//
//Example 3:
//Input: x = 120
//Output: 21
//
//Example 4:
//Input: x = 0
//Output: 0
public class P1 {
	public static int reverse(int x) {
		String s = String.valueOf(x);
		List<Character> list= new ArrayList<>(); 
		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
			}
		Collections.sort(list);
		Collections.reverse(list);
		String num = "";
		for (int i = 0; i < s.length(); i++) {
		num += list.get(i);
		}
		x = (int) Long.parseLong(num);
		return x;
	}
	public static void main(String[] args) {
		System.out.println(reverse(123));
	}
}

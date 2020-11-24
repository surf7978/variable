package com.yedam.interfaces;

import java.util.Arrays;

public class ActionExample {
	
	String name;
	ActionExample(String name){
		this.name = name;
	}
	
	public int compareTo(ActionExample o) {
		return name.compareTo(o.name);
	}
		
	
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();//복사

		action = () ->  {
				System.out.println("운전을 합니다.");
			};//요약해서 이렇게도 씀
		action.work();//운전
		System.out.println("---------------");
		
		
		char[] arr1 = {'J', 'A', 'V', 'a'};
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOfRange(arr1,1,3);
		System.out.println(Arrays.toString(arr3));
		
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1,0,arr4,0,arr1.length);
		for(int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"]="+arr4[i]);
		}
		System.out.println("---------------");
		int[][] original = {{1,2},{3,4}};
		System.out.println("[얕은 복제후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: "+original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: "+Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교: "+Arrays.equals(original, cloned1));
		
		//깊은 복사후 비교
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교: "+original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: "+Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교: "+Arrays.deepEquals(original, cloned2));
		System.out.println("---------------");
		
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++ ) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
//		ActionExample m1 = new ActionExample("홍길동");
//		ActionExample m2 = new ActionExample("박동수");
//		ActionExample m3 = new ActionExample("김민수");
//		ActionExample[] members = {m1, m2, m3};
//		Arrays.sort(members);
//		for(int i=0; i<members.length; i++) {
//			System.out.println("members["+i+"].name="+members[i].name);
//		}
				
	}

}

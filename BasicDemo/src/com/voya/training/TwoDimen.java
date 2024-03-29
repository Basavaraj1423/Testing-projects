package com.voya.training;

public class TwoDimen {

	public static void main(String[] args) {
		int[][] marks = new int[3][3];
		marks[0][0] = 40;
		marks[0][1] = 80;
		marks[0][2] = 70;
		marks[1][0] = 90;
		marks[1][1] = 80;
		marks[1][2] = 70;
		marks[2][0] = 90;
		marks[2][1] = 80;
		marks[2][2] = 70;
//		for (int i = 0; i < marks.length; i++) {
//			for (int j = 0; j < marks[i].length; j++) {
//				System.out.print(marks[i][j] + "  ");
//			}
//			System.out.println();
//		}
		
		for(int []one : marks) {
			for(int num: one) {
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}

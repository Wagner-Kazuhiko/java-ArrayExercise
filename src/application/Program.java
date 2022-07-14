package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		int N = sc.nextInt();
		
		System.out.println("Enter the number of colluns");
		int M = sc.nextInt();
		
		int [][] mat = new int [N][M];
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Position: " + mat[0][1]);
		System.out.println("Left: " + mat[0][0]);
		System.out.println("Right: " + mat[0][2]);
		System.out.println("Down: " + mat[1][1]);
		

	}

}

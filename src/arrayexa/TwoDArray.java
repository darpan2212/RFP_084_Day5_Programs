package arrayexa;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	static Scanner sc;

	public static void main(String[] args) {

		System.out.println("Enter number of rows : ");
		sc = new Scanner(System.in);

		int m = sc.nextInt();

		System.out.println("Enter number of columns : ");
		int n = sc.nextInt();

//		sc.close();
		System.out.println("Rows : " + m + " Columns: " + n);

		if (m > 0 && n > 0) {
			TwoDArray twoDArray = new TwoDArray();
			twoDArray.setArrayValues(m, n);
		} else {
			System.out.println("Invalid inputs");
		}
	}

	public void setArrayValues(int row, int col) {
		int[][] twoDArr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter value of [" + i + "][" + j + "] => ");
				twoDArr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		TwoDArray twoDArray = new TwoDArray();
		twoDArray.printArrayValues(twoDArr, row, col);
	}

	public void printArrayValues(int[][] twoDArr, int row, int col) {
		try {
			PrintWriter writer = new PrintWriter("D://array.txt");

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {

					writer.write("" + twoDArr[i][j] + "\t");
					writer.flush();

				}
				writer.write("\n");
				writer.flush();
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception occurs");
			e.printStackTrace();
		}
	}
}
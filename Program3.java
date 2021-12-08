package assesment_8_12_2021;

import java.util.Scanner;

public class Program3 {
	public static void main(String args[]) {
		int i,j,row;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered number of rows: ");
		row = sc.nextInt();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
			System.out.print(j + " ");
		}
			System.out.println();
		}
		
	}
}

package assesment_8_12_2021;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		int i,j,row;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered your row:");
		row = sc.nextInt();
		for(i=row;i>=0;i--) {
			for(j=row-1;j>=i;j--) {
				if(i<j)
				System.out.print(j+" ");
				}
			System.out.println();
}
}
}
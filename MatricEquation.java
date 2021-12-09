//Q2)Write a program for calculating Matrix Operations.

package assesment_9_12_2021;
import java.util.*;
   
public class MatricEquation {
	public static void main(String args[]){  
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		    
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//multiplying and printing multiplication of 2 matrices    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}(c[i][j]+" ");  
		}  
		System.out.println();   
	}    
  } 
}



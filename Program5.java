package assesment_8_12_2021;

public class Program5 {
public static void main (String args []) {
	int i,j,temp;
	int arr[] ={9,2,13,14,1};
	 temp=0;
	System.out.println("Elements of original array:");
	for (i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	
	//sorting of array in assending order..
	
	for(i=0;i<arr.length;i++) {
		for(j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println();
	
	System.out.println(" elements of arry sorted in assending order");
	for (i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
}
}

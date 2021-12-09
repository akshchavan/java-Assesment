package assesment_9_12_2021;

class A{  
public  A(){
	System.out.println("hello akshay");
	}  
public A(int x){  
   this();  
   System.out.println(x);  
  }  
}  

public class ThisMethod {
	public static void main(String args[]){  
		A a=new A(10);  
   } 
}

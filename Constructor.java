package assesment_9_12_2021;

class SimpleObject {
	//non parameterised..
SimpleObject() {
System.out.println("No argument Constructor");
}
//parameteried..
SimpleObject(int a) {
System.out.println("One argument Constructor");
}
}
public class Constructor {
public static void main(String arg[]) {
new SimpleObject();
new SimpleObject(100);
}
}

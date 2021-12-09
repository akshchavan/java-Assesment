package assesment_9_12_2021;
import java.util.*;
class Room {
int roomNo;
String roomType;
float roomArea;
boolean acMachine;

public void setData(int rno, String rt, float area, boolean ac) {
roomNo = rno;
roomType = rt;
roomArea = area;
acMachine = ac;
}

public void displayData() {
System.out.println("The room Is " + roomNo);
System.out.println("The room Type is " + roomType);
System.out.println("The room area is " + roomArea);
String s = (acMachine) ? "yes" : "no";
System.out.println("The A / c Machine needed: " + s);
}

public static void main(String arg[]) {
Room room1 = new Room();
room1.setData(420, "Luxury", 700.0f, true);
room1.displayData();
}
}

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		
	Student sd1 = new Student("18/039/BSSE-S","Pius",2018);
	System.out.println("STUDENT NAME :"+sd1.getName());
	System.out.println("STUDENT YEAR OF BIRTH :"+sd1.getYOB());
	System.out.println("STUDENT REGESTRATION NUMBER :"+sd1.getRegNO());
	sd1.getCourseWork();
	
	
}
}


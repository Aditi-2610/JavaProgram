package javaProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


	  

public class Main {
	static String fileName ="JavaProject (1) (1).csv";
	static Scanner sc= new Scanner(System.in);
	static File file = new File(fileName);
	static double sum_fixedCost = 0;
	static double sum_ActualHRs = 0;
	
	
	 static void display_total() {
		 try {
				Scanner inputStream  = new Scanner(file); //TODO read about file
				inputStream.next();//ignores the first line
				String data = inputStream.next();
				String[] values = data.split(",");
				//Will print the total of Fixed Cost & Actual Hrs columns.
				System.out.println("Total of fixed cost is: "+values[8]);
				System.out.println("Total of Actual Hrs is: "+values[10]);
				inputStream.close();
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		    
		  }
	 
	 static void display_columns() {
		 
		 try {
				Scanner inputStream  = new Scanner(file); //TODO read about file
				while(inputStream.hasNext()) {
					String data = inputStream.next();//this gets a whole line
					String[] values = data.split(",");
					//Will print Status, Priority, Deadline, Fixed Cost, Actual Hrs columns in the console.
					System.out.println(values[0]+"->"+values[1]+"->"+values[2]+"->"+values[8]+"->"+values[10]);
					
				}
				inputStream.close();
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	 }
	 static void option() {
		 System.out.println("Choose: \n 1:print Status, Priority, Deadline, Fixed Cost, Actual Hrs columns in the console \n 2:print the total of Fixed Cost & Actual Hrs columns. \n 3:To get options again \n 4:to exit");
		  //System.in is a standard input stream.
		 System.out.print("Enter first number- ");
		 int input= sc.nextInt();
		 int cont=0;
		 
		 switch(input){
		 case 1: display_columns();
		 System.out.println("Do you want to continue?(1/0)");
			cont= sc.nextInt();
			if (cont == 1) {
				option();
			}else {
				break;
			}
		 break;
		 case 2: display_total();
		 System.out.println("Do you want to continue?(1/0)");
			cont= sc.nextInt();
			if (cont == 1) {
				option();
			}else {
				break;
			}
		 break;
		 case 3: option();
		 break;
		 default : System.out.println("Thank You");
		 }
		
		 
			
	 }
	
	public static void main(String args[]) {
		
		option();
		
	   
		
		
		
	}


}

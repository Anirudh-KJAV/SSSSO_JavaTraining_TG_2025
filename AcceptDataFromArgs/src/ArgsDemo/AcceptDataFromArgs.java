package ArgsDemo;

import java.util.Scanner;



public class AcceptDataFromArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
         
        
         
         System.out.print("Enter your first name: ");
         
         String firstName = scanner.nextLine();
         
         System.out.print("Enter your second name: ");
         
         String secondName = scanner.nextLine();
         
         System.out.println("My name is "+firstName +" "+secondName);
         
         
         scanner.close();
	}

}

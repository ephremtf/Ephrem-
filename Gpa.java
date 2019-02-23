import java.util.Scanner;

public class Gpa {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		double gpa =0.0;
		int creditHours = 0;
		int award = 0;
		boolean validGpa = true;
		
		System.out.print("Enter your GPA: ");
		
			gpa = s.nextDouble();
		
		System.out.print("Enter your creadit hours: ");
		
			creditHours = s.nextInt();
			
		if (gpa >=3.0) {
			
			award = 100;
		}else if (gpa >=2.0) {
			
			award = 50; 
			
		}
		if (validGpa) {
			
			award = creditHours *award;
			System.out.print("Your Award is: "+award);
		}else {
			award = creditHours *0;
			
			System.out.print("Your Award is: "+award);
		}
			
			
		s.close();
		
    
		
	}

}

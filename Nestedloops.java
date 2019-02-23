
public class Nestedloops {

	public static void main(String[] args) {
		
		int x = 1;
		int result =0; 
		
		System.out.printf("  |");
		
	
		while (x <=9) {
		System.out.printf("%4d",x);
					
		x++;
		
	}
	System.out.println("\n---------------------------------------");
	
	
	int z =1;
	while(z <=9) {
		
		System.out.println(z+" |");
		
		z++; 
	}
	for (int t=1; t<=9; t++) {
		for(int a=1;a<=9;a++) {
			result = t*a;
			//result;
			System.out.print(result);
			
		}
		
	}
	//int result = 0;
	//result = z *x;
	
	
	
	}
	
	
}

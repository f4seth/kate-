import java.util.Scanner;

public class program_06e {
	public static void main(String[] args)
	{
	
	Scanner stdIn = new Scanner(System.in);
		
	String bitstring = "";
	int base10 = 0;	
	int user_input1;
	int cnt = 0;
	int ult_tally = 1;
	int fin_tally = 0;
	int exponent = -1;
	int first_exponent = 0;
		
		
// user validation
		do
		{
			System.out.println("------------------------");
			System.out.println("0 --> Concatenate a 0");
			System.out.println("1 --> Concatenate a 1");
			System.out.println("2 --> Exit");
		
			System.out.println("\n\nChoose an operator from the menu above: ");
			
			user_input1 = stdIn.nextInt();
				
			exponent++;			

			
//if else statements that sort base10			
			if(exponent == 0)
			{		
				bitstring += user_input1;
				if(user_input1 == 1)
				{
					first_exponent = 1;
					
				} else if(user_input1 == 0)
				{
					first_exponent = 0;
				}
				
			}	
			else if(user_input1 == 0) 
			{
				bitstring += user_input1;
				ult_tally *= 2;
				
				
			} else if(user_input1 == 1) 
			{
				bitstring += user_input1;
				ult_tally *= 2;
				fin_tally += ult_tally;
			}
		
			
			
			
			System.out.println("Your current string binary code has concatenated to this : \n");
			System.out.println(bitstring);		
//print out final and ultimate tallies			
			System.out.println("here is the ultimate tally:" + ult_tally);
			System.out.println("here is the final tally:" + fin_tally);
			
			
		} while(user_input1 != 2);
				
		//Code that will convert bitstring(binary) variable into decimal form.
		
		
		
		
		System.out.println("\n");
		System.out.println("The binary " + bitstring + " is equivalent to");
		System.out.println("------------------\n");
		System.out.println("Your binary to decimal conversion is: " + fin_tally);
		
	} // method  end
}



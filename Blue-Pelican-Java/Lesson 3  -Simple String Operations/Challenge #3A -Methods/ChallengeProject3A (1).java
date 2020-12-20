package challenge3A;

// Omar - 9/18/2020
// Challenge 3A Methods

public class ChallengeProject3A 
{
	//main method
	public static void main(String[] args) 
	{
		String firstName = "Omar";
		String lastName = "Ndiaye";
			

			
			//print out all UpperCase
			System.out.println(firstName.toUpperCase() +  " " + lastName.toUpperCase());
			
			// print out all LowerCase
			System.out.println(firstName.toLowerCase() + " " + lastName.toLowerCase());
			
			//Using Substring method to print first and last character clipped off 
			System.out.println(firstName.substring(1,3));
			
			//Printing full Name by using concatenating method
			System.out.println(firstName + " " + lastName);
		
			
	}

}
